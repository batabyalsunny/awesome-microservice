/**
 * 
 */
package ml.bootcode.awesomeuserservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ml.bootcode.dtos.UserDto;

/**
 * @author sunnyb
 *
 */
@RestController
public class UserController {

	@GetMapping
	public List<UserDto> getUsers() {

		List<UserDto> list = new ArrayList<>();
		list.add(new UserDto(1L, "Sunny"));
		list.add(new UserDto(2L, "Subho"));

		return list;
	}
}
