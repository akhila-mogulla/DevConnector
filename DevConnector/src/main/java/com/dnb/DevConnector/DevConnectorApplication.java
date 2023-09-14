package com.dnb.DevConnector;

import java.util.Scanner;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dnb.DevConnector.Services.ProfileService;
import com.dnb.DevConnector.Services.UserService;
import com.dnb.DevConnector.dto.RegisterUser;
import com.dnb.DevConnector.dto.UserProfile;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@SpringBootApplication

public class DevConnectorApplication {

	public static void main(String[] args) {
		
		//ApplicationContext applicationContext = 
		SpringApplication.run(DevConnectorApplication.class, args);
		
		//RegisterUser registerUser = new RegisterUser();
	//	UserService userService =
				//applicationContext.getBean(UserService.class).createUser(registerUser);
		//ProfileService profileService = applicationContext.getBean(ProfileService.class);
		
		
		//UserProfile userProfile = null;
		/*	
		//registerUser = new RegisterUser("Akhila", "akhla@gmail.com", "1235","1235");
		userProfile = new UserProfile(UUID.randomUUID(),"Intern","anb","www.abc.com","Hyderabad","html,css,javascript",
				"anand01","Tech enthusiastic",true,"abc.com","abc.com","abc.com","abc.com","abc.com");
		
		Scanner sc = new Scanner(System.in);
		
		
			
		
		
		
		while(true) {
			System.out.println("Enter any option from below..\n1.create\n2.getUser\n3.deleteUser\n4.getAllUsers\n5.Exit\n");
			int condition = sc.nextInt();
			switch (condition) {
			case 1: 
				userService.createUser(registerUser);
				profileService.createProfile(userProfile);
				break;
			case 2:
				userService.getUserByEmail("akhla@gmail.com");
				profileService.getProfileByGit("anand01");
				break;
			case 3:
				userService.deleteUserByEmail("akhla@gmail.com");
				profileService.deleteProfileByGit("akhla@gmail.com");
				break;
			case 4:
				userService.getAllUsers();
				profileService.getAllProfiles();
				break;
			case 5:
				System.out.println("Thanks, you got exit...");
				System.exit(0);
			default:
				throw new IllegalArgumentException("Unexpected value: " + condition);
			}
		
		
		}
			
		*/
		
		
		
		
		}	
		
		 
	}


