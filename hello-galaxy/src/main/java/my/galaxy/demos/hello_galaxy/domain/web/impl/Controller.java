package my.galaxy.demos.hello_galaxy.domain.web.impl;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.linkgie.galaxyframework.web.HttpService;

import my.galaxy.demos.hello_galaxy.domain.web.VO;
import my.galaxy.demos.hello_galaxy.domain.web.WebService;

@HttpService
public class Controller implements WebService{

	@Override
	public VO[] getList() {
		// TODO: 从数据库查询数据；
		VO[] list = new VO[2];
		for (int i = 0; i < list.length; i++) {
			list[i] = new VO();
			list[i].setId("X-" + i);
			list[i].setName("数据-" + i);
			list[i].setValue(10 + i);
		}

		return list;
	}

	@Override
	public void create(@RequestBody VO data1) {
		// TODO: 插入；
	}

	@Override
	public void update(@RequestBody VO data1) {
		// TODO: 更新；
	}

	@Override
	public void delete(@PathVariable("id") String id) {
		// TODO: 删除；
	}

}
