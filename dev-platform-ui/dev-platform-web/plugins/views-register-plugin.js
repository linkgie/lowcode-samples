const fs = require("fs");
const path = require("path");

// 页面根目录；
const VIEWS_ROOT = path.join(__dirname, "../src/views");

function generateViewImport(varName, viewKey, viewPath, importFrom) {
  // 直接导入；
  // const tempate = `import ${varName} from "${from}";`;

  // 动态导入 + 视图路由定义；
  // const tempate = `const ${varName} ={ key: "${viewKey}", path:"${viewPath}",  component: () => import("${importFrom}") } ;`;
  
  // return tempate;

  // 直接导入 + 视图路由定义；
  const importCode = `import ${varName}_component from "${importFrom}";`
  const viewRouteCode = `const ${varName} ={ key: "${viewKey}", path:"${viewPath}",  component: ${varName}_component } ;`;

  return importCode + "\r\n" + viewRouteCode;
}

function generateArray(arrayVarName, componentVarNames) {
  const itemNames = componentVarNames.join(",\r\n");

  const viewsArrayCode = `const ${arrayVarName} = [
${itemNames}
];`;

  return viewsArrayCode;
}

function generateViewsExport(viewsVar, defaultViewVar) {
  return `export { ${viewsVar} as Views, ${defaultViewVar} as DefaultView };`;
}

function generatVarName(articleName) {
  return articleName.replace(/[-]/g, "_");
}

/**
 * 返回视图目录下所有 vue 组件的文件名（不含扩展名）和文件路径；
 * @returns [{name, path}] 返回数组;
 */
function getAllViews(rootDirectory) {
  // 扫描文章子目录清单；
  const vueComponents = [];
  scanVueComponents(rootDirectory, vueComponents);
  return vueComponents;
}

function scanVueComponents(dir, vueCompoennts) {
  // 扫描文章子目录清单；
  const subPaths = fs.readdirSync(dir, { withFileTypes: true });

  // 生成要编译文章页面清单；
  subPaths.forEach((dirent) => {
    if (dirent.isFile() && dirent.name.endsWith(".vue")) {
      // 判断组件的文件布局是“单一文件（single）”还是"组合文件(composite)"；
      // 单一文件布局是指只有一个 .vue 文件，模板和代码都包含在其中；
      // 组合文件布局是指有独立的 .js 代码文件（必须）， .html 模板文件(可选)， .css 样式文件(可选)，以 .vue 文件引用模板、代码和样式；
      
      // 组件文件名（不包含 .vue 扩展名）；
      let compositeLayout = false;
      const componentFileName = dirent.name.substring(0, dirent.name.length - 4);
      const scriptFilePath = path.join(dir, componentFileName + ".js");
      if (fs.existsSync(scriptFilePath)) {
        compositeLayout = true;
      }

      // 如果是"组合文件(composite)" 布局，以文件夹的名称为组件名；
      // 如果是“单一文件（single）” 布局，以 .vue 文件名为组件名（不含 .vue）；
      let componentName = componentFileName;
      if (compositeLayout) {
        componentName = path.basename(dir);
      }

      const component = {
        name: componentName,
        compositeLayout: compositeLayout,
        dir: dir,
        vuePath: dir + "/" + dirent.name,
        scriptFilePath: scriptFilePath,
      };
      vueCompoennts.push(component);

      // console.log("-------- sacning view["+componentFileName+"] : ", component);

    } else if (dirent.isDirectory()) {
      // 递归检查下一级；
      const subdir = dir + "/" + dirent.name;
      scanVueComponents(subdir, vueCompoennts);
    }
  });
}

/**
 * 生成视图注册的 JS 代码；
 * 
 * @param {*} rootDirectory 扫描发现视图组件的根路径；
 * @param {*} defaultViewPath 相对于根路径的默认视图组件的路径；
 */
function generateViewsRegisterJS(rootDirectory, defaultViewPath) {
  const ROOT_DIR_OF_VIEWS = rootDirectory ? rootDirectory : VIEWS_ROOT;
  const views = getAllViews(ROOT_DIR_OF_VIEWS);

  const viewComponentVarNameSet = {};
  const viewVarNames = [];
  const viewImportCodes = [];
  let defautViewVar = "";
  views.forEach((component) => {
    // 生成组件变量名；
    var varName = generatVarName(component.name);
    if (viewComponentVarNameSet[varName]) {
      // 变量名冲突；
      for (let i = 0; i < 1000; i++) {
        const newName = varName + "_" + (i + 1);
        if (!viewComponentVarNameSet[newName]) {
          varName = newName;
          break;
        }
      }
      if (viewComponentVarNameSet[varName]) {
        // 命名序号排列超 1000 之后仍然冲突，则抛出异常；
        throw "Too many naming conflictions while resolving the importing view component variable name!";
      }
    }
    viewComponentVarNameSet[varName] = true;

    const viewVarName = varName + "_view";
    viewVarNames.push(viewVarName);

    // 生成导入语句；
    const relativeFilePath = component.vuePath.replace(ROOT_DIR_OF_VIEWS, "").replace(/\\/g, "/");
    const importFrom = "." + relativeFilePath; // 导入路径要以相对路径 ./ 开头；

    // 视图路径；
    // 如果组件的文件布局是“组合”方式，则采用组件目录的相对路径作为视图路径；
    // 否则，以组件的 vue 文件路径的相对路径作为视图路径；
    let viewPath = relativeFilePath.replace(/\.vue$/, ".view");
    if (component.compositeLayout) {
      viewPath = component.dir.replace(ROOT_DIR_OF_VIEWS, "") + ".view";
    }
    const viewKey = viewPath.substring(1); // 去掉路径头部的路径分隔符；

    const importCode = generateViewImport(viewVarName, viewKey, viewPath, importFrom);
    viewImportCodes.push(importCode);

    // 检查获得默认的视图组件的变量名；
    if (defaultViewPath && importFrom.endsWith(defaultViewPath)) {
      defautViewVar = viewVarName;
    }
  }); //End of: views.forEach ;

  const importSegment = viewImportCodes.join("\r\n");
  const viewArrayVarName = "VIEWS";
  const viewsArrayDeclaration = generateArray(viewArrayVarName, viewVarNames);
  // 如果没有找到默认视图组件，则以首个视图为默认视图；
  if (!defautViewVar && viewVarNames.length > 0) {
    defautViewVar = viewVarNames[0];
  }
  const viewsExport = generateViewsExport(viewArrayVarName, defautViewVar);

  const viewJsCodes = importSegment + "\r\n\r\n" + viewsArrayDeclaration + "\r\n\r\n" + viewsExport;

  const viewJsFile = path.join(ROOT_DIR_OF_VIEWS, "views.js");
  fs.writeFileSync(viewJsFile, viewJsCodes);
}

const ArticlePlugin = {
  generateViewsRegisterJS: generateViewsRegisterJS,
};

module.exports = ArticlePlugin;
