package com.atm.system.service;

import com.atm.system.dto.LoginDto;
import com.atm.system.dto.SignupDto;
import com.atm.system.entity.AccHolder;


public interface HolderService {
	

	void addHolder(SignupDto signupDto);

//	ResponseEntity<String> checkHolder(LoginDto loginDto);
	
	public AccHolder checkHolder(LoginDto loginDto);

}
