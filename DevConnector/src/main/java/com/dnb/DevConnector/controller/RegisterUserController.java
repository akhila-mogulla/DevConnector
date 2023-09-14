package com.dnb.DevConnector.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnb.DevConnector.dto.RegisterUser;

@RestController
@RequestMapping("/api/registeruser")
public class RegisterUserController {
	
	@PostMapping("/create")
	public RegisterUser createUser(@RequestBody RegisterUser registerUser ) {
		return registerUser;
	}

}
