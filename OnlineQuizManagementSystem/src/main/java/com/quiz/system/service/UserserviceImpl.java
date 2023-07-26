package com.quiz.system.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.system.model.User;
import com.quiz.system.model.UserRole;
import com.quiz.system.repository.RoleRepository;
import com.quiz.system.repository.UserRepository;

@Service
public class UserserviceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		
		User existCheck=this.userRepository.findByUserName(user.getUserName());
		
		if(existCheck!=null) {
			System.out.println("User Already exist!!");
			
			throw new Exception("User Already Exist");
		
		}else {
			//creating User
			for(UserRole ur:userRoles) {
				System.out.println("inside for");
				roleRepository.save(ur.getRole());
				
			}
			
			user.getUserRoles().addAll(userRoles);
			existCheck=this.userRepository.save(user);
			System.out.println("inside else");
		}
		
		return existCheck;
	}

	@Override
	public User gettingUser(String username) {
		
		return this.userRepository.findByUserName(username);
	}

	@Override
	public void deleteUser(int userId) {
		this.userRepository.deleteById(userId);
		
	}

}
