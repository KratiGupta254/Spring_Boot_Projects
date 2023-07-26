package com.login.signup.service;




import com.login.signup.dto.EmployeeDto;
import com.login.signup.dto.LoginDto;
import com.login.signup.response.LoginResponse;


public interface EmployeeService {

	String addEmployee(EmployeeDto employeeDto);

	LoginResponse loginEmployee(LoginDto loginDto);

}
