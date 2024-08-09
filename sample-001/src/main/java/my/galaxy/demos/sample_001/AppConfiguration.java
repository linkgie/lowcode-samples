package my.galaxy.demos.sample_001;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@Configuration
@ComponentScan
public class AppConfiguration {
	
}
