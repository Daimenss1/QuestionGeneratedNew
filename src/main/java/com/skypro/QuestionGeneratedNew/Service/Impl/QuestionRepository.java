package com.skypro.QuestionGeneratedNew.Service.Impl;

import com.skypro.QuestionGeneratedNew.Model.Question;

import java.util.Collection;

public interface QuestionRepository{
    boolean add(Question question);
    boolean remove(Question question);
    Collection<Question> getAll();

}