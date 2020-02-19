package ml.bootcode.awesomeuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AwesomeUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwesomeUserServiceApplication.class, args);
	}

}
