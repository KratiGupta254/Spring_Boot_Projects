package com.atm.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.system.entity.Operations;

public interface OperationsRepo extends JpaRepository<Operations, Long>{

	List<Operations> findByAccNo(Long accNo);

}
