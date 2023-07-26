package com.quiz.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.system.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
