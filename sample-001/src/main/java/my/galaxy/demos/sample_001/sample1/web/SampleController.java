package my.galaxy.demos.sample_001.sample1.web;

import java.util.LinkedHashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.linkgie.galaxyframework.utils.CollectionUtils;
import com.linkgie.galaxyframework.web.HttpDelete;
import com.linkgie.galaxyframework.web.HttpGet;
import com.linkgie.galaxyframework.web.HttpPost;
import com.linkgie.galaxyframework.web.HttpPut;
import com.linkgie.galaxyframework.web.HttpService;

@HttpService
public class SampleController{

	private LinkedHashMap<String, SampleVO> sampleVos = new LinkedHashMap<>();

	/**
	 * 初始化示例数据；
	 */
	public SampleController() {
		for (int i = 0; i < 4; i++) {
			SampleVO sampleVO = new SampleVO();
			sampleVO.setId("X-" + i);
			sampleVO.setName("数据-" + i);
			sampleVO.setValue(10 + i);

			sampleVos.put(sampleVO.getId(), sampleVO);
		}

	}

	@HttpGet("/sample1/list")
	public SampleVO[] getList() {
		return CollectionUtils.toArray(this.sampleVos.values(), SampleVO.class);
	}

	@HttpPost("/sample1/data")
	public void create(@RequestBody SampleVO data1) {
		this.sampleVos.putIfAbsent(data1.getId(), data1);
	}

	@HttpPut("/sample1/data")
	public void update(@RequestBody SampleVO data1) {
		this.sampleVos.put(data1.getId(), data1);
	}

	@HttpDelete("/sample1/data/{id}")
	public void delete(@PathVariable("id") String id) {
		// TODO: 删除；
	}

}
