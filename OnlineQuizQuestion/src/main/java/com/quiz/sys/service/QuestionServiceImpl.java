package com.quiz.sys.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.sys.entity.Question;
import com.quiz.sys.repo.QuestionRepo;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	private QuestionRepo questionRepo;

	@Override
	public Question addQuestion(Question question) {
		return this.questionRepo.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {
		return this.questionRepo.save(question);
	}

	@Override
	public Set<Question> getQuestions() {
		return new HashSet<>(this.questionRepo.findAll());
	}

	@Override
	public Question getQuestionById(Long quesId) {
		return this.questionRepo.findById(quesId).get();
	}

	@Override
	public void deleteQuestion(Long quesId) {
		Question question=new Question();
		question.setQuesId(quesId);
		this.questionRepo.delete(question);
		
	}

}
