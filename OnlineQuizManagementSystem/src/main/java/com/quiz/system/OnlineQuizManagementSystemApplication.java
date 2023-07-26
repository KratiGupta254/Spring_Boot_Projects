package com.quiz.system;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.quiz.system.model.Role;
import com.quiz.system.model.User;
import com.quiz.system.model.UserRole;
import com.quiz.system.service.UserService;


@SpringBootApplication
public class OnlineQuizManagementSystemApplication implements CommandLineRunner{
	
	@Autowired
	 private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");
		
//		User user=new User();
//		
//		user.setFirstName("Krati");
//		user.setLastName("Gupta");
//		user.setUserName("krati123");
//		user.setPassword("12345");
//		user.setEmail("krati@gmail.com");
//		
//		Role role1=new Role();
//		//role1.setRoleId(11);
//		role1.setRoleName("ADMIN");
//		
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		
//		userRoleSet.add(userRole);
//		
//		User user1=this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUserName()); 
	}

}
 