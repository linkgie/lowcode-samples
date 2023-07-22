package com.linkgie.lowcode.dev.platform;

import java.io.File;

import com.linkgie.galaxyframework.context.ApplicationHome;
import com.linkgie.galaxyframework.context.HomePath;

@ApplicationHome
public interface AppHome {
	
	@HomePath("demo")
	File getDemoRoot();
	
}
