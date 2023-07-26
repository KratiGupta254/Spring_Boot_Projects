package com.atm.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.system.entity.Functionality;

public interface FunctionalityRepo extends JpaRepository<Functionality,Long>{
	
	List<Functionality> findByAccNo(Long accNo);

	

}
