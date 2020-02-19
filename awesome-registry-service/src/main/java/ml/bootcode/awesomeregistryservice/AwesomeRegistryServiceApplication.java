package ml.bootcode.awesomeregistryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AwesomeRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwesomeRegistryServiceApplication.class, args);
	}

}
