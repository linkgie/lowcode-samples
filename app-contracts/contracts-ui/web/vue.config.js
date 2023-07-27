// const {generateViewsRegisterJS} = require("./plugins/views-register-plugin.js");

// const path = require("path");


module.exports = {
  //publicPath:"/static",
  pages: {

    constracts_1: {
      template: "public/template.html",
      entry: "src/contracts-1/main.js",
      filename: "contract.html",
      title: "星河低代码 | 示例: 合同管理表单",
    },
    constracts_2: {
      template: "public/template.html",
      entry: "src/contracts-2/main.js",
      filename: "contract-2.html",
      title: "星河低代码 | 示例: 合同管理表单(动态）",
    },
    
  },


  configureWebpack:config=>{
    // GZip压缩
    const CompressionPlugin = require('compression-webpack-plugin');
    config.plugins.push(
      new CompressionPlugin({
        algorithm:'gzip',
        test:/\.(js|css|woff|woff2|svg)$/,  // 要压缩的文件
        threshold:10240, // 压缩超过10k的数据
        deleteOriginalAssets:false, // 不删除压缩前的文件，如果浏览器不支持Gzip，则会加载源文件
        minRatio:0.8 // 压缩比大于0.8的文件将不会被压缩
      })
    );
  }
};
