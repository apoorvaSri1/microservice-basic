package com.questionservices.services.impl;


import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.stereotype.Service;

import com.questionservices.entites.Question;
import com.questionservices.repositories.QuestionRepository;
import com.questionservices.services.QuestionService;

@Service   
// to inject any whare  and autowired
public class QuestionServiceImpl implements QuestionService{

	private QuestionRepository questionRepository;
	
	public QuestionServiceImpl(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	
	@Override
	public Question create(Question question) {
		
		return questionRepository.save(question);
	}

	@Override
	public List<Question> getAll() {
		return questionRepository.findAll();
	}

	@Override
	public Question getOne(Long id) {
		return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not Found !!"));
	}


	@Override
	public List<Question> getQuestionsOfQuiz(Long quizId) {
		return questionRepository.findByQuizId(quizId);
	}

}

