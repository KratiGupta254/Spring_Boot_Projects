package com.atm.system.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.system.dto.LoginDto;
import com.atm.system.dto.SignupDto;
import com.atm.system.entity.AccHolder;
import com.atm.system.repository.AccHolderRepo;

@Service
public class HolderServiceImpl implements HolderService {

	@Autowired
	private AccHolderRepo accHolderRepo;

	@Override
	public void addHolder(SignupDto signupDto) {

		AccHolder accHolder = new AccHolder(signupDto.getId(),
				signupDto.getAccNo(), signupDto.getName(),
				signupDto.getFatherName(), signupDto.getEmail(),
				signupDto.getDob(), signupDto.getPin(), signupDto.getAddress(),signupDto.getBalance()
				);
		this.accHolderRepo.save(accHolder);

	}

	@Override
	public AccHolder checkHolder(LoginDto loginDto) {
		AccHolder accountHolder = accHolderRepo.findByAccNo(loginDto.getAccNo());

		if (accountHolder != null) {
			if (accountHolder.getPin().equals(loginDto.getPin())) {
				return accountHolder;
			}

		}

		return null;
	}

}
