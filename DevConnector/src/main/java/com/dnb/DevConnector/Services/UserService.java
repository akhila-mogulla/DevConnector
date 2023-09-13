package com.dnb.DevConnector.Services;

import java.util.List;
import java.util.Optional;


import com.dnb.DevConnector.dto.RegisterUser;


public interface UserService {
	
	public RegisterUser createUser(RegisterUser registerUser);
	
	public Optional<RegisterUser> getUserByEmail(String email);
	
	public boolean deleteUserByEmail(String email);
	
	public List<RegisterUser> getAllUsers();

}
