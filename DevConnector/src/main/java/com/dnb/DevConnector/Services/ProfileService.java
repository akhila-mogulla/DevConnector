package com.dnb.DevConnector.Services;

import java.util.List;
import java.util.Optional;

import com.dnb.DevConnector.dto.UserProfile;

public interface ProfileService {
	public UserProfile createProfile(UserProfile userProfile);
	
	public Optional<UserProfile> getProfileByGit(String github_username);
	
	public boolean deleteProfileByGit(String github_username);
	
	public List<UserProfile> getAllProfiles();

}
