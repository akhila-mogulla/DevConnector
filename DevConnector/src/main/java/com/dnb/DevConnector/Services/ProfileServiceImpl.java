package com.dnb.DevConnector.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnb.DevConnector.Repo.ProfileRepository;
import com.dnb.DevConnector.dto.UserProfile;
@Service
public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	ProfileRepository profileRepository;

	@Override
	public UserProfile createProfile(UserProfile userProfile) {
		// TODO Auto-generated method stub
		//return null;
		return profileRepository.save(userProfile);
	}

	@Override
	public Optional<UserProfile> getProfileByGit(String github_username) {
		// TODO Auto-generated method stub
		//return Optional.empty();
		return profileRepository.findById(github_username);
	}

	@Override
	public boolean deleteProfileByGit(String github_username) {
		// TODO Auto-generated method stub
		if(profileRepository.existsById(github_username)) {
			profileRepository.deleteById(github_username);
			return true;
		}
		else
			//exception occurs username not found
		return false;
	}

	@Override
	public List<UserProfile> getAllProfiles() {
		// TODO Auto-generated method stub
		return (List<UserProfile>) profileRepository.findAll();
	}

}
