/**
 * 
 */
package ml.bootcode.awesomecabservice.controllers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import ml.bootcode.dtos.UserDto;

/**
 * @author sunnyb
 *
 */
@RequestMapping("owners")
@RestController
public class CabOwnerController {

	RestTemplate restTemplate;
	UserServiceClient userServiceClient;

	public CabOwnerController(RestTemplate restTemplate, UserServiceClient userServiceClient) {
		super();
		this.restTemplate = restTemplate;
		this.userServiceClient = userServiceClient;
	}

	@HystrixCommand(fallbackMethod = "usersFallback")
	@GetMapping("rest")
	public List<UserDto> getThroughRestTemplate() {

		UserDto[] users = restTemplate.getForObject("http://awesome-user-service/", UserDto[].class);
		return Arrays.asList(users);
	}

	@HystrixCommand(fallbackMethod = "usersFallback")
	@GetMapping("feign")
	public List<UserDto> getThroughFeign() {

		return userServiceClient.getUsers();
	}

	public List<UserDto> usersFallback() {
		return Collections.emptyList();
	}
}
