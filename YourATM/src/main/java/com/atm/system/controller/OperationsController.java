package com.atm.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atm.system.dto.DepositDto;
import com.atm.system.dto.WithdrawDto;
import com.atm.system.entity.Complain;
import com.atm.system.entity.Operations;
import com.atm.system.repository.ComplaintRepo;
import com.atm.system.service.OperationsService;

@RestController
@CrossOrigin
@RequestMapping("/atm")
public class OperationsController {
	
	@Autowired
	private OperationsService operationsService;
	
	@Autowired
	private ComplaintRepo complaintRepo;
	
	@PutMapping("/deposit")
	public ResponseEntity<DepositDto> depositBalance(@RequestBody DepositDto depositDto){
		operationsService.depositBalance(depositDto);
		
		return new ResponseEntity<>(depositDto,HttpStatusCode.valueOf(200));
	}
	
	@PutMapping("/withdrawl")
	public ResponseEntity<WithdrawDto> withdrawAmount(@RequestBody WithdrawDto withdrawDto){
		operationsService.withdrawAmount(withdrawDto);
		
		return new ResponseEntity<>(withdrawDto,HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/transactionhistory")
	public ResponseEntity<List<Operations>> transactionHistory(@RequestParam Long accountNo ){
		List<Operations> transactionHistory = operationsService.transactionHistory(accountNo);
		return new ResponseEntity<>(transactionHistory,HttpStatusCode.valueOf(200));
		
	}
	
	@PostMapping("/complaint")
	public ResponseEntity<Complain> addComplain(@RequestBody Complain complain){
		Complain complainContent=operationsService.addComplain(complain);
		long accno = complainContent.getAccNo();
		return new ResponseEntity<>(complainContent,HttpStatusCode.valueOf(200));
	}
	
	



	
	

}
