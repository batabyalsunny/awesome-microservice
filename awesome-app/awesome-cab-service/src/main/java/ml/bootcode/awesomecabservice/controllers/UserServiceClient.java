/**
 * 
 */
package ml.bootcode.awesomecabservice.controllers;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import ml.bootcode.dtos.UserDto;

/**
 * @author sunnyb
 *
 */
@FeignClient(name = "awesome-user-service")
public interface UserServiceClient {

	@GetMapping
	List<UserDto> getUsers();
}
