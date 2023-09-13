package com.dnb.DevConnector.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dnb.DevConnector.dto.RegisterUser;

@Repository
public interface UserRepository  extends CrudRepository<RegisterUser, String>{

}
