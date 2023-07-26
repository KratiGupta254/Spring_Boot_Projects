package com.atm.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atm.system.entity.Complain;

public interface ComplaintRepo extends JpaRepository<Complain, Long>{

}
