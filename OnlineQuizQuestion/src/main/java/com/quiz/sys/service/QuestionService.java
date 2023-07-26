package com.quiz.sys.service;

import com.quiz.sys.entity.Question;

public interface QuestionService {
	
	public Question addQuestion(Question question);
	
	public Question updateQuestion(Question question);
	
	public java.util.Set<Question> getQuestions();
	
	public Question getQuestionById(Long quesId);
	
	public void deleteQuestion(Long quesId);
	
	

}
