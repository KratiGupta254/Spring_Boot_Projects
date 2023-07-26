package com.atm.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atm.system.dto.LoginDto;
import com.atm.system.entity.AccHolder;
import com.atm.system.service.HolderService;



@RestController
@CrossOrigin("*")
@RequestMapping("/atm")
public class HolderController {
	
	@Autowired
	private HolderService holderService;
			
	
	@PostMapping("/signup")
	public ResponseEntity<AccHolder> addHolder(@RequestBody AccHolder accHolder){
	holderService.addHolder(accHolder);
	return new ResponseEntity<>(accHolder,HttpStatusCode.valueOf(200));

	}
	
    @PostMapping("/login")
    public ResponseEntity<LoginDto> checkHolder(@RequestBody LoginDto loginDto){
	LoginDto checkHolder=holderService.checkHolder(loginDto);
	if(checkHolder != null) {
		return  new ResponseEntity<>( checkHolder,HttpStatus.OK);
	}
     return new ResponseEntity(HttpStatusCode.valueOf(401));
		
    }
    
    
    @GetMapping("/getbalance/{accNo}")
    public Double getBalance(@PathVariable Long accNo) {
    	Double balance= holderService.getBalance(accNo);
    	return balance;
    }
    
    

	

}
