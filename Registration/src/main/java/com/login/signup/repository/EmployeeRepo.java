package com.login.signup.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.login.signup.entity.Employee;

//@EnableJpaRepositories

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	Optional<Employee> findOneByEmailAndPassword(String email,String password);	
	 
	Employee findByEmail(String email);

}
