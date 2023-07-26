package com.login.signup.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.login.signup.dto.EmployeeDto;
import com.login.signup.dto.LoginDto;
import com.login.signup.entity.Employee;
import com.login.signup.repository.EmployeeRepo;
import com.login.signup.response.LoginResponse;

@Service
public class EmployeeImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String addEmployee(EmployeeDto employeeDto) {
		  
		Employee employee=new Employee(
				
				employeeDto.getId(),
				employeeDto.getName(),
				employeeDto.getEmail(),
				this.passwordEncoder.encode(employeeDto.getPassword())
				
				);
		
		       employeeRepo.save(employee);
		
		       return employee.getName();
				
				
			
				}
	
	@Override
	public LoginResponse loginEmployee(LoginDto loginDto)
	{
        String msg = "";
        Employee employee1 = employeeRepo.findByEmail(loginDto.getEmail());
        if (employee1 != null) {
            String password = loginDto.getPassword();
            String encodedPassword = employee1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<Employee> employee = employeeRepo.findOneByEmailAndPassword(loginDto.getEmail(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {

                return new LoginResponse("password Not Match", false);
            }
        }else {
            return new LoginResponse("Email not exits", false);
        }


    }

	}


