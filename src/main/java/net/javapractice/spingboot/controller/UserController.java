package net.javapractice.spingboot.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javapractice.spingboot.model.User;
import net.javapractice.spingboot.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("api/")
public class UserController {
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	@Autowired
	private UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("users")
	public List<User> getUsers () {
		return this.userRepository.findAll();
	}
	
	@GetMapping("{userId}")
	public User getUser(@PathVariable String userId) {
		LOG.info("Getting user with ID: {}.", userId);
		return userRepository.findOne(userId);
	}
	
	@PostMapping("user/create")
	public User addNewUsers(@RequestBody User user) {
		LOG.info("Saving user.");
		return userRepository.save(user);
	}


	@RequestMapping(value = "settings/{userId}", method = RequestMethod.GET)
	public Object getAllUserSettings(@PathVariable String userId) {
		User user = userRepository.findOne(userId);
		if (user != null) {
			return user.getUserSettings();
		} else {
			return "User not found.";
		}
	}
	
	@RequestMapping(value = "/settings/{userId}/{key}", method = RequestMethod.GET)
	public String getUserSetting(@PathVariable String userId, @PathVariable String key) {
		User user = userRepository.findOne(userId);
		if (user != null) {
			return user.getUserSettings().get(key);
		} else {
			return "User not found.";
		}
	}
	
	@RequestMapping(value = "/settings/{userId}/{key}/{value}", method = RequestMethod.GET)
	public String addUserSetting(@PathVariable String userId, @PathVariable String key, @PathVariable String value) {
		User user = userRepository.findOne(userId);
		if (user != null) {
			user.getUserSettings().put(key, value);
			userRepository.save(user);
			return "Key added";
		} else {
			return "User not found.";
		}
	}
}
