package io.javastarter.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<UserModal> getAllUsers(){
		List<UserModal> users = new ArrayList<UserModal>();
		this.userRepository.findAll().forEach(users::add);
		return users;
	}
	
	public Optional<UserModal> getUser(String email) {
		return this.userRepository.findById(email);
	}

	public void addUser(UserModal user) {
		userRepository.save(user);
	}
	
	public void updateUser(UserModal user) {
		this.userRepository.save(user);
	}
	
	public void deleteUser(String email) {
		this.userRepository.deleteById(email);
	}
}
