package miu.edu.eaproject.service;

import miu.edu.eaproject.domain.Question;
import miu.edu.eaproject.exceptions.NotFoundException;
import miu.edu.eaproject.persistence.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }
    public Question getQuestionById(Integer id){
        Optional<Question> optionalQuestion = questionRepository.findById(id);
        if(optionalQuestion.isPresent()){
            return optionalQuestion.get();
        }
        else{
            throw new NotFoundException("Question with the passed id not Found!!");
        }
    }
    public Question addQuestion(Question question){
        questionRepository.save(question);
        return question;
    }
    public Question updateQuestion(Integer id, Question question){
        Optional<Question> optionalStudent =  questionRepository.findById(id);
        if(optionalStudent.isPresent()){
            Question st = optionalStudent.get();
            st.setQuestion(question.getQuestion());
            questionRepository.save(st);
            return st;
        }
        else{
            throw new NotFoundException("Question with the passed id Not Found");
        }
    }
    public Integer deleteQuestion(Integer id){
        Optional<Question> optionalQuestion = questionRepository.findById(id);
        if(optionalQuestion.isPresent()){
            questionRepository.deleteById(id);
            return id;
        }
        else{
            throw new NotFoundException("Question with the passed id not Found!!");
        }
    }
}
