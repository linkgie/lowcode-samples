{
  "applicationId": "lowcode-snippets",
  "applicationName": "星河低代码示例",
  // 其它菜单配置；
  // "activeProfiles": ["main"],
  "features": {
    "menus": [
      {
        key: "home",
        name: "首页",
        icon: "bs-svg-house-door",
        href: "home.view",
      },
      {
        key: "forms",
        name: "表单",
        icon: "bs-svg-receipt",
        submenus:[
          {
            key: "form-1",
            name: "信息表单",
            icon: "bs-svg-receipt",
            href: "form-1.view",
          },
          {
            key: "form-2",
            name: "提交信息表单",
            icon: "bs-svg-receipt",
            href: "form-2.view",
          },
          {
            key: "form-3",
            name: "上传下载文件图片",
            icon: "bs-svg-receipt",
            href: "form-3.view",
          },
        ]
      },
      {
        key: "grids",
        name: "表格",
        icon: "bs-svg-grid-3x3",
        submenus:[
          {
            key: "grid-1",
            name: "分页表格+详情表单",
            icon: "bs-svg-grid-3x3",
            href: "grid-1.view",
          }
        ]
      },
      {
        key: "trees",
        name: "树",
        icon: "bs-svg-diagram-3",
        submenus:[
          {
            key: "tree-1",
            name: "无限级联树",
            icon: "bs-svg-diagram-3",
            href: "tree-1.view",
          }
        ]
      },
    ],
    // "toolbars": []
  }
}