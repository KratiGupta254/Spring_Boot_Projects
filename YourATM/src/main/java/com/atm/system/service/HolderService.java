package com.atm.system.service;

import com.atm.system.dto.LoginDto;
import com.atm.system.entity.AccHolder;

public interface HolderService {


	void addHolder(AccHolder accHolder);

	LoginDto checkHolder(LoginDto loginDto);

	Double getBalance(Long accNo);

}
