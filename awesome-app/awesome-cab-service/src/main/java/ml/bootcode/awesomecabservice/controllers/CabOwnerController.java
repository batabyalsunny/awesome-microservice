/**
 * 
 */
package ml.bootcode.awesomecabservice.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

	@GetMapping("rest")
	public List<UserDto> getThroughRestTemplate() {

		UserDto[] users = restTemplate.getForObject("http://awesome-user-service/", UserDto[].class);
		return Arrays.asList(users);
	}

	@GetMapping("feign")
	public List<UserDto> getThroughFeign() {

		return userServiceClient.getUsers();
	}
}
