package my.galaxy.demos.hello_galaxy.domain.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.linkgie.galaxyframework.web.HttpDelete;
import com.linkgie.galaxyframework.web.HttpGet;
import com.linkgie.galaxyframework.web.HttpPost;
import com.linkgie.galaxyframework.web.HttpPut;
import com.linkgie.galaxyframework.web.HttpService;

@HttpService
public interface WebService {

	@HttpGet("/sample1/list")
	VO[] getList();

	@HttpPost("/sample1/data")
	void create(@RequestBody VO data1);

	@HttpPut("/sample1/data")
	void update(@RequestBody VO data1);

	@HttpDelete("/sample1/data/{id}")
	void delete(@PathVariable("id") String id);

}
