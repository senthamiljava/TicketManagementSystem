package com.revature.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.tms.model.User;
import com.revature.tms.repository.UserRepository;


@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@PostMapping
	public User save(@RequestBody User user)
	{
	   return userRepository.save(user);
	}
	
	@GetMapping
	
	public List<User> findAll()
	{
		return userRepository.findAll();
	}
}
