package com.questionservices.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questionservices.entites.Question;
import com.questionservices.services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	
	private QuestionService questionService;
	
	public QuestionController(QuestionService questionService) {
		this.questionService= questionService;
	}
	
	// create
	@PostMapping
	public Question create(@RequestBody Question question) {
		return questionService.create(question);
	}
	
	@GetMapping  //("/question")
	public List<Question> getAll(){
		return questionService.getAll();
	}
	
	@GetMapping("/{questionId}")
	public Question getAll(@PathVariable Long questionId){
		return questionService.getOne(questionId);
	}
	
	// get all the Questions of Specific Quiz.
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId ){
		return questionService.getQuestionsOfQuiz(quizId);
	}
	
	
}

