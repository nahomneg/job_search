package miu.edu.eaproject.service;

import miu.edu.eaproject.domain.TechnicalInterview;
import miu.edu.eaproject.exceptions.NotFoundException;
import miu.edu.eaproject.persistence.TechnicalInterviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TechnicalInterviewService {
    final TechnicalInterviewRepository technicalInterviewRepository;

    public TechnicalInterviewService(TechnicalInterviewRepository technicalInterviewRepository) {
        this.technicalInterviewRepository = technicalInterviewRepository;
    }

    public List<TechnicalInterview> getAllTechnicalInterviews(){
        return technicalInterviewRepository.findAll();
    }
    public TechnicalInterview getTechnicalInterviewById(Integer id){
        Optional<TechnicalInterview> optionalTechnicalInterview = technicalInterviewRepository.findById(id);
        if(optionalTechnicalInterview.isPresent()){
            return optionalTechnicalInterview.get();
        }
        else{
            throw new NotFoundException("TechnicalInterview with the passed id not Found!!");
        }
    }
    public TechnicalInterview addTechnicalInterview(TechnicalInterview technicalInterview){
        technicalInterviewRepository.save(technicalInterview);
        return technicalInterview;
    }
    public TechnicalInterview updateTechnicalInterview(Integer id, TechnicalInterview technicalInterview){
        Optional<TechnicalInterview> optionalStudent =  technicalInterviewRepository.findById(id);
        if(optionalStudent.isPresent()){
            TechnicalInterview st = optionalStudent.get();
            st.setDuration(technicalInterview.getDuration());
            st.setLocation(technicalInterview.getLocation());
            st.setQuestions(technicalInterview.getQuestions());
            st.setDate(technicalInterview.getDate());
            st.setEmail(technicalInterview.getEmail());
            st.setPhone(technicalInterview.getPhone());
            technicalInterviewRepository.save(st);
            return st;
        }
        else{
            throw new NotFoundException("TechnicalInterview with the passed id Not Found");
        }
    }
    public Integer deleteTechnicalInterview(Integer id){
        Optional<TechnicalInterview> optionalTechnicalInterview = technicalInterviewRepository.findById(id);
        if(optionalTechnicalInterview.isPresent()){
            technicalInterviewRepository.deleteById(id);
            return id;
        }
        else{
            throw new NotFoundException("TechnicalInterview with the passed id not Found!!");
        }
    }
}
