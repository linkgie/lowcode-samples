package my.galaxy.demos.hello_galaxy;

import java.io.IOException;

import com.linkgie.galaxyframework.module.Module;

public class AppModule implements Module {

	@Override
	public String getName() {
		return "MyGapp";
	}

	@Override
	public <T> T getComponent(Class<T> componentType) {
		return null;
	}

	@Override
	public void close() throws IOException {
		// 当 Galaxy 中间件关闭之前会调用此方法；
		System.out.println("已关闭应用["+ this.getName()+"]!");
	}

}
