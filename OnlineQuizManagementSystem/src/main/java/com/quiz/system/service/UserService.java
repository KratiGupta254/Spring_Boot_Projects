package com.quiz.system.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.quiz.system.model.User;
import com.quiz.system.model.UserRole;

@Service
public interface UserService {
	
	public User createUser(User user,Set<UserRole> userRoles) throws Exception;
	
	public User gettingUser(String username);
	
	public void deleteUser(int userId);

}
