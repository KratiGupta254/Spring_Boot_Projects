package com.atm.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.atm.system.dto.LoginDto;
import com.atm.system.entity.AccHolder;
import com.atm.system.entity.Operations;
import com.atm.system.repository.AccHolderRepo;


@Service
public class HolderServiceImpl implements HolderService{
	
	@Autowired
	private AccHolderRepo accHolderRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;	
	
	@Override
	public void addHolder(AccHolder accHolder) {		
		accHolder.setPin(this.passwordEncoder.encode(accHolder.getPin()));
		this.accHolderRepo.save(accHolder);
	}


	@Override
	public LoginDto checkHolder(LoginDto loginDto) {
		AccHolder holderPerson=accHolderRepo.findByAccNo(loginDto.getAccNo());
		if (holderPerson.getAccNo() != null) {
            String password=loginDto.getPin();
            String encodedPassword = accHolderRepo.findByAccNo(holderPerson.getAccNo()).getPin();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
            	System.out.println("password matched and user logged in");
            	return loginDto;
            } 
            else {
            	System.out.println("password did not match!");
            }   		
		}
		else {
        	System.out.println("acc no not found");
        }
		System.out.println("after");
		return null;

	}

	@Override
	public Double getBalance(Long accNo) {
		AccHolder holderPerson=accHolderRepo.findByAccNo(accNo);
		return holderPerson.getBalance();
	}


	
}
