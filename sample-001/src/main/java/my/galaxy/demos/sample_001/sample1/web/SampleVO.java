package my.galaxy.demos.sample_001.sample1.web;

import com.linkgie.galaxyframework.metadata.DataEntity;
import com.linkgie.galaxyframework.metadata.DataField;
import com.linkgie.galaxyframework.metadata.DataInterface;
import com.linkgie.galaxyframework.metadata.DataKey;
import com.linkgie.galaxyframework.metadata.DataLabel;
import com.linkgie.galaxyframework.metadata.DataType;

@DataInterface
@DataEntity
public class SampleVO {
	
	@DataKey
	@DataField(name = "Id", order = 0, readonly = true)
	private String id;
	
	@DataLabel
	@DataField(name = "名称", order = 1)
	private String name;
	
	@DataField(name = "值", order = 2)
	private int value;
	
	@DataType(contentType = "plain;multiline=true")
	@DataField(name = "描述", order = 3)
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
