package ml.bootcode.awesomecabservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableFeignClients
@SpringBootApplication
public class AwesomeCabServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwesomeCabServiceApplication.class, args);
	}

}
