package com.dnb.DevConnector.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dnb.DevConnector.dto.UserProfile;

//@Repository
public interface ProfileRepository extends CrudRepository<UserProfile, String>{

}
