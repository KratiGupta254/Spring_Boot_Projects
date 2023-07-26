package com.atm.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.system.dto.DepositDto;
import com.atm.system.dto.WithdrawDto;
import com.atm.system.entity.AccHolder;
import com.atm.system.entity.Complain;
import com.atm.system.entity.Operations;
import com.atm.system.repository.AccHolderRepo;
import com.atm.system.repository.ComplaintRepo;
import com.atm.system.repository.OperationsRepo;

@Service
public class OperationsServiceImpl implements OperationsService{
	
	@Autowired
	private AccHolderRepo accHolderRepo;
	
	@Autowired
	private OperationsRepo operationsRepo;
	
	@Autowired
	private ComplaintRepo complaintRepo;

	@Override
	public void depositBalance(DepositDto depositDto) {
		AccHolder findByAccNo = accHolderRepo.findByAccNo(depositDto.getAccNo());
		if(depositDto.getDepositAmt()>0) {
			
			findByAccNo.setBalance(findByAccNo.getBalance()+depositDto.getDepositAmt());
			accHolderRepo.save(findByAccNo);
			
			operationsRepo.save(new Operations(findByAccNo.getAccNo(),false,depositDto.getDepositAmt()));
			
		}
		
	}

	@Override
	public void withdrawAmount(WithdrawDto withdrawDto) {
		AccHolder findByAccNo = accHolderRepo.findByAccNo(withdrawDto.getAccNo());
		if(withdrawDto.getWithdrawAmt()<=findByAccNo.getBalance() && withdrawDto.getWithdrawAmt()<=25000) {
			
			findByAccNo.setBalance(findByAccNo.getBalance()-withdrawDto.getWithdrawAmt());
			accHolderRepo.save(findByAccNo);
			operationsRepo.save(new Operations(findByAccNo.getAccNo(),true,withdrawDto.getWithdrawAmt()));
		
	}

		
	}

	@Override
	public List<Operations> transactionHistory(Long accountNo) {
		
    List<Operations> functionalityList = operationsRepo.findByAccNo(accountNo);
		
		return functionalityList;

	}

	@Override
	public Complain addComplain(Complain complain) {
		return complaintRepo.save(complain);
	}

}
