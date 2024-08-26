package com.linkgie.lowcode.manuls.lowcode_snippets;

import java.io.File;

import com.linkgie.galaxyframework.context.HomeConfig;
import com.linkgie.galaxyframework.context.HomePath;

@HomeConfig
public interface AppHome {
	
	/**
	 * 注：
	 * 这是一个示例代码，展示如何定义一个在 Home 目录下的子目录或者配置文件；
	 * <br>
	 * 调用获得的返回值是该子目录或文件的完整路径；<p>
	 * 
	 * 这不是必须的，可以移除此方法；
	 * @return
	 */
	@HomePath("demo")
	File getDemoRoot();
	
}
