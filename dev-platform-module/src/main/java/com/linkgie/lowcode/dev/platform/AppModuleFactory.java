package com.linkgie.lowcode.dev.platform;

import com.linkgie.galaxyframework.context.HomeContext;
import com.linkgie.galaxyframework.module.Module;
import com.linkgie.galaxyframework.module.ModuleFactory;

public class AppModuleFactory implements ModuleFactory{

	@Override
	public Class<?> getHomeConfiguration() {
		return AppHome.class;
	}

	@Override
	public Module createModule(HomeContext home) {
		// 当 Galaxy 中间件启动之后在初始化时会调用此方法；
	    // 此方法的执行时间在 Spring 容器初始化之前；
		
		Module module = new AppModule();
	    System.out.println("初始化应用["+module.getName()+"]...");
	    
		return module;
	}

}
