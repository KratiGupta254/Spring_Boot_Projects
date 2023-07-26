package com.quiz.sys.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.sys.entity.Question;

public interface QuestionRepo extends JpaRepository<Question, Long>{

}
