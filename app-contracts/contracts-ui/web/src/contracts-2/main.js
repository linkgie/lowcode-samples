import { runApp, Logger } from "flexue";
import { BootstrapIcons,ElIcons } from "flexue-icons";

Logger.level = "INFO";
Logger.get("flexue.components.x-databoard").level = "DEBUG";

import LOGO from "../../assets/logo.png";

// import { Views, DefaultView } from "./views/views.js";
import Contract from "./contracts/contract.vue";




runApp(
  "#page",
  {
    title: "低代码示例",
    logo: LOGO,
    entry: Contract,

    libs:[ BootstrapIcons,ElIcons],
   
    enableGalaxyService: true,
    galaxyService: {
      serviceMetadataUrl: "/v2/api-docs",
    },

    http: {
      pathPrefix: "/api",

      // 排除 swagger API ，不自动添加前缀；
      prefixExcludedList: ["/v2/api-docs"],
    },
  }, 
  
  () => {
    if (window.closeSplash) {
      setTimeout(()=>{
        window.closeSplash();
      }, 300);
    }
  }
);
