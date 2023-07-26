package com.atm.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
	
	@PutMapping("/newpin")
	public ResponseEntity<NewPinDto> changePin(@RequestBody NewPinDto newPinDto ){
		newPinService.changePin(newPinDto);
		return new ResponseEntity<>(newPinDto,HttpStatusCode.valueOf(200));
		
	}

}
