package com.skypro.QuestionGeneratedNew.Service.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.skypro.QuestionGeneratedNew.Model.Exception.InvalidExamAmountException;
import com.skypro.QuestionGeneratedNew.Model.Question;
import com.skypro.QuestionGeneratedNew.Service.ExaminerService;
import com.skypro.QuestionGeneratedNew.Service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;



@Service
public class ExaminerServiceImpl implements ExaminerService {

    private static final Logger log = LoggerFactory.getLogger(ExaminerServiceImpl.class);

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }



    @Override
    public Collection<Question> getQuestions(int amount) {
        int size = questionService.getSize();
        if (amount <= 0 || size < amount) {
            log.error("Amount must be positive" + size);
            throw new InvalidExamAmountException(amount, size);
        }
        Set<Question> questions = new HashSet<>();
        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }
        log.info("The following random question for amount" + questions);
        return questions;

    }
}
