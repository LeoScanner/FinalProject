package com.dajeRaga.FinalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dajeRaga.FinalProject.entity.User;
import com.dajeRaga.FinalProject.service.ServiceUser;




@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private ServiceUser serviceUser;

	// GET
	@GetMapping("/users")
	public List<User> listUser() {
		List<User> su = serviceUser.findAll();
		return su;
	}

	// POST
	@PostMapping("/user")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceUser.save(user));

	}
}
