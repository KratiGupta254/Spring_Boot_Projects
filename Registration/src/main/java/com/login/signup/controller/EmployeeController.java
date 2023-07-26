package com.login.signup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.signup.dto.EmployeeDto;
import com.login.signup.dto.LoginDto;
import com.login.signup.response.LoginResponse;
import com.login.signup.service.EmployeeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody EmployeeDto employeeDto) {
		String id=employeeService.addEmployee(employeeDto);
		return id;
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginEmployee(@RequestBody LoginDto loginDto){
		LoginResponse loginResponse=employeeService.loginEmployee(loginDto);
		return ResponseEntity.ok(loginResponse);
	}

	
}
