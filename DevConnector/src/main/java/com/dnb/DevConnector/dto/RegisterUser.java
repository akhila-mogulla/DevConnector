package com.dnb.DevConnector.dto;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.dnb.DevConnector.utils.CustomIdGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@Entity
@Table
public class RegisterUser {
	
//	public RegisterUser(String name, String email, String password){
	//	this.name=name;
		//this.email=email;
		//this.password=password;
	//}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "registerUser_seq")
	@GenericGenerator(name = "registerUser_seq", strategy = "com.dnb.DevConnector.utils.CustomIdGenerator",
	parameters = {@Parameter(name=CustomIdGenerator.INCREMENT_PARAM, value = "50"),
			@Parameter(name=CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "User_"),
			@Parameter(name=CustomIdGenerator.DATE_FORMAT_PARAMETER, value = "flag"),
			@Parameter(name=CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d")
			})
	private String userId;
	private String name;
	private String email;
	private String password;
	private String confirmPassword;
	

	
	

}
