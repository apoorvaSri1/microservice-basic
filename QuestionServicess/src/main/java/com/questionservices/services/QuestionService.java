package com.questionservices.services;

import java.util.List;

import com.questionservices.entites.Question;
//import com.question.entities.Question;

public interface QuestionService {

	Question create(Question question);
	
	List<Question> getAll();
	
	Question getOne(Long id);
	
	List<Question> getQuestionsOfQuiz(Long quizId);
	
}
