package com.dnb.DevConnector.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnb.DevConnector.Repo.UserRepository;
import com.dnb.DevConnector.dto.RegisterUser;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	UserRepository userRepository;

	@Override
	public RegisterUser createUser(RegisterUser registerUser) {
		// TODO Auto-generated method stub
		return userRepository.save(registerUser);
		//return null;
	}

	@Override
	public Optional<RegisterUser> getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findById(email);
		//return Optional.empty();
	}

	@Override
	public boolean deleteUserByEmail(String email) {
		// TODO Auto-generated method stub
		if(userRepository.existsById(email)) {
			userRepository.deleteById(email);
			return true;
		}
		else {
			//add the exception user email not found
			return false;
			
		}
		
	}

	@Override
	public List<RegisterUser> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<RegisterUser>) userRepository.findAll();
		//return null;
	}
	
	



}
