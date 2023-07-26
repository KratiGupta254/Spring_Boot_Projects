package com.quiz.system.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.system.model.Role;
import com.quiz.system.model.User;
import com.quiz.system.model.UserRole;
import com.quiz.system.service.UserService;

@RestController
@RequestMapping("/user")
public class Controller {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/posting")
	public User createUser(@RequestBody User user) throws Exception {
		
		Set<UserRole> roles=new HashSet<>();
		Role role=new Role();
		role.setRoleId(12);
		role.setRoleName("NORMAL");
		
		UserRole userRole=new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		
		roles.add(userRole);
		return this.userService.createUser(user, roles);
		
	}
	/*
	 * @GetMapping("/ueidhdx") public ResponseEntity<User> getUserByUserName(){ User
	 * user = new User(); return new
	 * ResponseEntity<User>(user,HttpStatusCode.valueOf(200)); }
	 */
	
	 // @DeleteMapping("/{userId}")
		/*
		 * public ResponseEntity<String> deleteUser(@PathVariable("userId") Integer
		 * userId) { this.userService.deleteUser(userId); return new
		 * ResponseEntity<String>("this user is deleted successfully",HttpStatusCode.
		 * valueOf(200));
		 * 
		 * }
		 */
	

	@GetMapping("/getting/{username}")
	public User gettingUser(@PathVariable ("username") String username) {
		return null;
			
	}
	
    @DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Integer userId) {
		this.userService.deleteUser(userId);
		
	}
}
