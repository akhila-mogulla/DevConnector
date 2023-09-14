package com.dnb.DevConnector.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnb.DevConnector.dto.UserProfile;

@RestController
@RequestMapping("/api/userprofile")
public class UserProfileController {
	
	@PostMapping("create")
	public UserProfile createProfile(@RequestBody UserProfile userProfile) {
		return userProfile;
	}

}
