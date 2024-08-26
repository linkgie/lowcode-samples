package com.linkgie.lowcode.manuls.lowcode_snippets.sample1.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.linkgie.galaxyframework.web.HttpDelete;
import com.linkgie.galaxyframework.web.HttpGet;
import com.linkgie.galaxyframework.web.HttpPost;
import com.linkgie.galaxyframework.web.HttpPut;
import com.linkgie.galaxyframework.web.HttpService;

@HttpService
public class SampleController{

	@HttpGet("/sample1/list")
	public SampleVO[] getList() {
		// TODO: 从数据库查询数据；
		SampleVO[] list = new SampleVO[2];
		for (int i = 0; i < list.length; i++) {
			list[i] = new SampleVO();
			list[i].setId("X-" + i);
			list[i].setName("数据-" + i);
			list[i].setValue(10 + i);
		}

		return list;
	}

	@HttpPost("/sample1/data")
	public void create(@RequestBody SampleVO data1) {
		// TODO: 插入；
	}

	@HttpPut("/sample1/data")
	public void update(@RequestBody SampleVO data1) {
		// TODO: 更新；
	}

	@HttpDelete("/sample1/data/{id}")
	public void delete(@PathVariable("id") String id) {
		// TODO: 删除；
	}

}
