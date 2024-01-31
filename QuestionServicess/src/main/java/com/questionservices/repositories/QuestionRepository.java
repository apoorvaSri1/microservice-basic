package com.questionservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questionservices.entites.Question;

import java.util.List;


public interface QuestionRepository extends JpaRepository<Question, Long> {

	List<Question> findByQuizId(Long quizId);
	
	
}
