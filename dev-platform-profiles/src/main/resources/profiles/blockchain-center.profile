{
  "page": "/index.html",
  "title": "区块链中心",
  "order": 300,
  "features": {
    "menus": [{
        key: "blockchain-home",
        name: "首页",
        icon: "bs-svg-house-door",
        href: "blockchain/home.view",
      },

      // 用户注册：
      {
        key: "blockchain-man",
        name: "区块链平台管理",
        icon: "bs-svg-1-square",
        submenus: [{
            key: "gateway-settings",
            name: "网关设置",
            icon: "bs-svg-1-circle",
            href: "blockchain/gatewaysettings.view",
          },
          {
            key: "ledger-settings",
            name: "账本设置",
            icon: "bs-svg-1-circle",
            href: "blockchain/ledgersettings.view",
          },
          {
            key: "key-store",
            name: "密钥库",
            icon: "bs-svg-1-circle",
            href: "blockchain/keystore.view",
          },
          {
            key: "traceable-blockchain-settings",
            name: "溯源区块链设置",
            icon: "bs-svg-1-circle",
            href: "blockchain/traceableblockchainsettings.view",
          },

        ],
      },

    ],
  },

}