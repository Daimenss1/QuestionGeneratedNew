package com.skypro.QuestionGeneratedNew.Controller;

import com.skypro.QuestionGeneratedNew.Model.Question;
import com.skypro.QuestionGeneratedNew.Service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;



@RestController
@RequestMapping("/java")
public class JavaQuestionController {

    private final QuestionService service;

    public JavaQuestionController(QuestionService service) {
        this.service = service;
    }
    @GetMapping("/add")
    public boolean add(@RequestParam String question, @RequestParam String answer) {
        return service.add(question, answer);
    }
    @GetMapping("/remove")
    public boolean remove(@RequestParam String question,@RequestParam String answer) {
        return service.remove(question, answer);
    }
    @GetMapping()
    public Collection<Question> getQuestions(){
        return service.getAll();
    }
}
