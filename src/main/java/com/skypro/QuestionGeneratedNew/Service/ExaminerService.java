package com.skypro.QuestionGeneratedNew.Service;

import com.skypro.QuestionGeneratedNew.Model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}

