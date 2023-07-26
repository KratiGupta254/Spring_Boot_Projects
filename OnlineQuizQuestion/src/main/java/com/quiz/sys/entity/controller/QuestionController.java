package com.quiz.sys.entity.controller;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.sys.entity.Question;
import com.quiz.sys.service.QuestionService;

@RestController
@CrossOrigin("*")
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	//adding question
	@PostMapping("/add")
	public ResponseEntity<Question> add(@RequestBody Question question){
		return ResponseEntity.ok(this.questionService.addQuestion(question));
	}
	
	//updating question
	@PutMapping("/update")
	public ResponseEntity<Question> update(@RequestBody Question question){
		return ResponseEntity.ok(this.questionService.updateQuestion(question));
	}
	
	//getting list of all the question
	@GetMapping("/getting")
	public Set<Question> getAllQuestions(){
		return this.questionService.getQuestions();
	}
	
//	@GetMapping("/{quesId}")
//	public ResponseEntity<Question> getQuestionById(@PathVariable("quizId") Long quesId){
//		return this.questionService.getQuestionById(quesId);
//		
//	}
	
	
	@DeleteMapping("/{quesId}")
	public void delete(@PathVariable("quesId") Long quesId) {
		this.questionService.deleteQuestion(quesId); 
	}
	
	
	
	

}
