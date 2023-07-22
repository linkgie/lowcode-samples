{
  "page": "/index.html",
  "title": "运营中心",
  "order": 200,
  "features": {
    "menus": [
      {
        key: "op-home",
        name: "首页",
        icon: "bs-svg-house-door",
        href: "operation/home.view",
      },

      // 用户注册：
      {
        key: "user-manager",
        name: "用户管理",
        icon: "bs-svg-1-square",
        submenus: [
          {
            key: "newly-register-users",
            name: "最新用户",
            icon: "bs-svg-1-circle",
            href: "user-mananger/newlyregisteruser.view",
          },
          {
            key: "actived-users-today",
            name: "当日活跃",
            icon: "bs-svg-1-circle",
            href: "operation/features-group1/feature-1-1.view",
          },
          
        ],
      },

      // 机构租户
      {
        key: "dev-organizations",
        name: "开发机构",
        icon: "bs-svg-1-square",
        submenus: [
          {
            key: "dev-org-register",
            name: "注册申请",
            icon: "bs-svg-1-circle",
            href: "operation/features-group1/feature-1-1.view",
          },
          {
            key: "newly-register-dev-orgs",
            name: "最新机构",
            icon: "bs-svg-1-circle",
            href: "operation/features-group1/feature-1-1.view",
          },
          {
            key: "actived-dev-orgs-of-month",
            name: "当月活跃",
            icon: "bs-svg-1-circle",
            href: "operation/features-group1/feature-1-1.view",
          },
        ],
      },

      // 下载管理
      {
        key: "download-management",
        name: "下载管理",
        icon: "bs-svg-1-square",
        submenus: [
          {
            key: "publish-resources",
            name: "发布资源",
            icon: "bs-svg-1-circle",
            href: "operation/publishresources.view",
          },
          {
            key: "actived-download",
            name: "活跃下载",
            icon: "bs-svg-1-circle",
            href: "operation/features-group1/feature-1-1.view",
          },
        ],
      },

      // 升级管理
      {
        key: "upgrade-management",
        name: "升级管理",
        icon: "bs-svg-1-square",
        submenus: [
          {
            key: "upgrade-policy",
            name: "升级策略",
            icon: "bs-svg-1-circle",
            href: "operation/features-group1/feature-1-1.view",
          },
        ],
      },

    //------ end of menus --------
    ],

  }
}