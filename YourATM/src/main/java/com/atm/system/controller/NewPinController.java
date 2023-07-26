package com.atm.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atm.system.dto.NewPinDto;
import com.atm.system.service.NewPinService;

@RestController
@CrossOrigin("*")
@RequestMapping("/atm")
public class NewPinController {
	
	@Autowired
	private NewPinService newPinService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	

	
	@PutMapping("/newpin")
	public boolean changePin(@RequestBody NewPinDto newPinDto){
		return newPinService.changePin(newPinDto);
	}
	
	

}
