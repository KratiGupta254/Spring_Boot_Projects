package com.atm.system.service;

//import java.security.AlgorithmConstraints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.system.dto.NewPinDto;
import com.atm.system.entity.AccHolder;
import com.atm.system.repository.AccHolderRepo;


@Service
public class NewPinServiceImpl implements NewPinService{
	
	@Autowired
	private AccHolderRepo accHolderRepo;
	
	
	@Override
	public void changePin(NewPinDto newPinDto) {
		AccHolder aHolder=accHolderRepo.findByAccNo(newPinDto.getAccNo());
			if(aHolder.getPin().equals(newPinDto.getPin())) {
				aHolder.setPin(newPinDto.getNewPin());
				accHolderRepo.save(aHolder);
			
		}
	}
	
}

	


