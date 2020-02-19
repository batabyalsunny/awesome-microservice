package ml.bootcode.awesomegetwayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class AwesomeGetwayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwesomeGetwayServiceApplication.class, args);
	}

}
