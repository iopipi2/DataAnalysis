package fis.TSD.DataAnalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = {RedisRepositoriesAutoConfiguration.class})
public class DataAnalysisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataAnalysisApplication.class, args);
	}

}
