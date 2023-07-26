package com.atm.system.service;

import java.util.List;

import com.atm.system.dto.DepositDto;
import com.atm.system.dto.WithdrawDto;
import com.atm.system.entity.Complain;
import com.atm.system.entity.Operations;

public interface OperationsService {

	void depositBalance(DepositDto depositDto);

	void withdrawAmount(WithdrawDto withdrawDto);

	List<Operations> transactionHistory(Long accountNo);

	Complain addComplain(Complain complain);

	

}
