/**
 * 
 */
package ml.bootcode.awesomeuserservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ml.bootcode.dtos.UserDto;

/**
 * @author sunnyb
 *
 */
@RestController
public class UserController {

	@Value("${ml.bootcode.message}")
	private String message;

	@GetMapping
	public List<UserDto> getUsers() {

		List<UserDto> list = new ArrayList<>();
		list.add(new UserDto(1L, "Sunny"));
		list.add(new UserDto(2L, "Subho"));

		return list;
	}

	@GetMapping("welcome")
	public String getExternalProperty() {
		return message;
	}
}
