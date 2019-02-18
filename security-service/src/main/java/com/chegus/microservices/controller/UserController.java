package com.chegus.microservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chegus.microservices.domain.UserDO;

@RestController
public class UserController {
	
	@GetMapping("getUsers")
	public List<UserDO> getUsers() {
		List<UserDO> userDOs = new ArrayList<>();
		userDOs.add(new UserDO("admin", "EMP-001", "Venkatesh Nettam"));
		return userDOs;
	}
}
