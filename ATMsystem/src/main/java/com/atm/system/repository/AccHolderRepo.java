package com.atm.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atm.system.entity.AccHolder;


public interface AccHolderRepo extends JpaRepository<AccHolder, Long>{

	AccHolder findByAccNo(Long accNo);

	//AccHolder findByUserAcc(Long accNo);
	
		

}
