package com.linkgie.lowcode.demo.contracts;

import java.io.File;

import com.linkgie.galaxyframework.context.ApplicationHome;
import com.linkgie.galaxyframework.context.HomePath;

@ApplicationHome
public interface AppHome {
	
	@HomePath("demo")
	File getDemoRoot();
	
}
