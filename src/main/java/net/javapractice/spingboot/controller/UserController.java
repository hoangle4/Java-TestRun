package net.javapractice.spingboot.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javapractice.spingboot.model.User;
import net.javapractice.spingboot.repository.UserRepository;

@RestController
@RequestMapping("api/")
public class UserController {

	@Autowired
	private UserRepository useRepository;
	
	@GetMapping("users")
	
	public List<User> getUsers () {
		return this.useRepository.findAll();
	}

}
