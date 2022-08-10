package miu.edu.eaproject.controller;

import miu.edu.eaproject.domain.Question;
import miu.edu.eaproject.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(path = "/questions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }
    @GetMapping(path = "/questions/{id}")
    public Question getQuestion(@PathVariable Integer id){
        return questionService.getQuestionById(id);
    }
    @PostMapping(path = "/questions")
    public Question postQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
    @PutMapping(path = "/questions/{id}")
    public Question updateQuestion(@PathVariable Integer id, @RequestBody Question question){
        return questionService.updateQuestion(id,question);
    }
    @DeleteMapping(path = "/question/{id}")
    public Integer deleteQuestion(@PathVariable Integer id){
        return questionService.deleteQuestion(id);
    }
}
