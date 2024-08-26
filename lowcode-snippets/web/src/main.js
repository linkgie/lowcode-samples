import { runApp, Logger } from "flexue";
import { BootstrapIcons, ElIcons } from "flexue-icons";
import FlexueLowcode from "flexue-lowcode";

// Flexue 适配的公式库 Mathjax，支持数学公式、化学公式等；
import { FlexueMathjax } from "flexue-mathjax";

// 导入视图清单；
// 注：视图清单 views.js 由编译插件根据 src/views 目录的内容自动生成，请不要手动修改；
import { Views, DefaultView } from "./views/views.js";

// 设置日志级别；
Logger.level = "INFO";
Logger.get("flexue.app").level = "DEBUG";
Logger.get("flexue.components").level = "DEBUG";
Logger.get("flexue.components.x-event").level = "WARN";
Logger.get("flexue.components.base.EventSourceComponent").level = "WARN";

// 加载应用；
runApp(
  "#page",
  {
    logo: "favicon.ico",

    views: Views,
    defaultView: DefaultView,

    // 引入其它库；
    // 注：以 vue.use(lib) 方式安装 ；
    libs:[FlexueMathjax, BootstrapIcons, ElIcons, FlexueLowcode],

    // 集成由后端提供的应用元数据；
    enableGalaxyService: true
  }
);
