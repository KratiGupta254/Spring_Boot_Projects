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

import com.atm.system.entity.EmailRequest;
import com.atm.system.service.EmailService;

import jakarta.mail.MessagingException;

@RestController
@CrossOrigin
@RequestMapping("/atm")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/")
	public void sendEmail(@RequestBody EmailRequest emailRequest) throws MessagingException{
		
	
		boolean	result=this.emailService.sendEmail(emailRequest.getTo(),emailRequest.getSubject(),emailRequest.getBody());
		System.out.print(result);

		}
		
	}
	


