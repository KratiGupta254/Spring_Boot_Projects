package com.atm.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.atm.system.dto.NewPinDto;
import com.atm.system.entity.AccHolder;
import com.atm.system.repository.AccHolderRepo;

@Service
public class NewPinServiceImpl implements NewPinService {
	@Autowired
	private AccHolderRepo accHolderRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

//	@Override
//	public void changePin(NewPinDto newPinDto) {
//		AccHolder aHolder = accHolderRepo.findByAccNo(newPinDto.getAccNo());
//		System.out.println("name = " + aHolder.getName());
//		if (passwordEncoder.matches(newPinDto.getPin(), aHolder.getPin())) {
//			aHolder.setPin(passwordEncoder.encode(newPinDto.getNewPin()));
//			accHolderRepo.save(aHolder);
//		}
//	}
	
	@Override
	public boolean changePin(NewPinDto newPinDto) {
		AccHolder aHolder = accHolderRepo.findByAccNo(newPinDto.getAccNo());
//		System.out.println("name = " +   aHolder.getName());
		if (passwordEncoder.matches(newPinDto.getPin(), aHolder.getPin())) {
			System.out.println("password matched");
			aHolder.setPin(passwordEncoder.encode(newPinDto.getNewPin()));
			accHolderRepo.save(aHolder);
			return true;
		}
		System.out.println("password wrong");
		return false;
	}
	
	


}
