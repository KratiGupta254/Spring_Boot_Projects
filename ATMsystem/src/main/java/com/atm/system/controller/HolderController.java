package com.atm.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atm.system.dto.LoginDto;
import com.atm.system.dto.SignupDto;
import com.atm.system.entity.AccHolder;
import com.atm.system.service.HolderService;


@RestController
@CrossOrigin("*")
@RequestMapping("/atm")
public class HolderController {
	
	@Autowired
	private HolderService holderService;
	
	@PostMapping("/signup")
	public ResponseEntity<SignupDto> addHolder(@RequestBody SignupDto signupDto){
		holderService.addHolder(signupDto);
		return new ResponseEntity<>(signupDto,HttpStatusCode.valueOf(200));

		
	}
	
//	@PostMapping("/signup")
//	public ResponseEntity<String> addHolder(@RequestBody SignupDto signupDto){
//		holderService.addHolder(signupDto);
//		return new ResponseEntity<String>("this user is succesfully added",HttpStatusCode.valueOf(200));
//
//		
//	}
	
	@PostMapping("/login")
	public <T> ResponseEntity<T> checkHolder(@RequestBody LoginDto loginDto){
	AccHolder checkHolder = holderService.checkHolder(loginDto);
	
	
	
	if(checkHolder != null) {
		return  new ResponseEntity<T>((T) checkHolder,HttpStatus.OK);
	}
	
	
	
	return new ResponseEntity<T>((T)"Please enter valid creditianls",HttpStatusCode.valueOf(401));
		
	}
	
	
//	@PostMapping("/login")
//	public void checkHolder(@RequestBody LoginDto loginDto){
//	AccHolder checkHolder = holderService.checkHolder(loginDto);
	
	
	
//	if(checkHolder != null) {
//		return  new ResponseEntity<T>((T) checkHolder,HttpStatus.OK);
//	}
	
	
	
//	return new ResponseEntity<T>((T)"Please enter valid creditianls",HttpStatusCode.valueOf(401));
		
	}
	
	
	
	
//	@PostMapping("/login")
//	public ResponseEntity<String> checkHolder(LoginDto loginDto){
//		
//	}

	

