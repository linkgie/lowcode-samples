/* eslint-disable no-undef */
import path from "path";
import { env } from "process";
import { fileURLToPath, URL } from "node:url";

import { ViewsScanner, ViteConfigurer } from "flexue-plugins";

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

// 生成视图

// 开发平台页面根目录；
const viewsRootDir = path.join(__dirname, "./src/views");
ViewsScanner.generate(viewsRootDir, "home.vue");


// ------------------------
// 服务端代理设置；
// ------------------------
const serverProxy = {
  target: "http://localhost:8080",
  changeOrigin: true,
  // followRedirects: true,
  // cookieDomainRewrite:{
  //   "*":""
  // },

  // 配置代理：运行后自动以指定的账号密码登录后端服务；
  // proxy : 'http-proxy' 实例
  configure: (proxy, options) => {
    // 账号需要事先由后端服务控制台或配置文件创建；
    // 采用 HTTP-BASIC 协议进行登录认证，需要服务端支持 HTTP-BASIC 方式，
    // 将服务端配置项 galaxyplatform.security.web.http-basic.enable 设置为 true；
    const username = "member1";
    const password = "abc@123";
    options.auth = `${username}:${password}`;
  },
};
// ------------------------

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [vue()],
  resolve: {
    alias: {
      "@": fileURLToPath(new URL("./src", import.meta.url)),
    },
  },

  
  build: ViteConfigurer.mode.application.defineBuild({
    // sourcemap:true,
    minify: env.NODE_ENV == "production",
    rollupOptions: {
      input: {
        index: path.join(__dirname, "index.html"),
      },
    },
  }), //End of: build;

  server: {
    proxy: {
      "/api": serverProxy,
      "/v2/api-docs": serverProxy,
      "/js/mathjax": serverProxy,
    },
  }, //End of: server;
});
