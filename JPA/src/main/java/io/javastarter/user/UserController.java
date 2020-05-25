package io.javastarter.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<UserModal> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping("/users/{email}")
	public Optional<UserModal> getUser(@PathVariable String email) {
		return userService.getUser(email);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/users")
	public void addUser(@RequestBody UserModal user) {
		userService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/users")
	public void updateUser(@RequestBody UserModal user) {
		userService.updateUser(user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/users/{email}")
	public void deleteUser(@PathVariable String email) {
		userService.deleteUser(email);
	}
	
}	
