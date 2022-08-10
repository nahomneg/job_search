package miu.edu.eaproject.service;

import miu.edu.eaproject.domain.ScreeningInterview;
import miu.edu.eaproject.exceptions.NotFoundException;
import miu.edu.eaproject.persistence.ScreeningInterviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScreeningInterviewService {
    final ScreeningInterviewRepository screeningInterviewRepository;

    public ScreeningInterviewService(ScreeningInterviewRepository screeningInterviewRepository) {
        this.screeningInterviewRepository = screeningInterviewRepository;
    }

    public List<ScreeningInterview> getAllScreeningInterviews(){
        return screeningInterviewRepository.findAll();
    }
    public ScreeningInterview getScreeningInterviewById(Integer id){
        Optional<ScreeningInterview> optionalScreeningInterview = screeningInterviewRepository.findById(id);
        if(optionalScreeningInterview.isPresent()){
            return optionalScreeningInterview.get();
        }
        else{
            throw new NotFoundException("ScreeningInterview with the passed id not Found!!");
        }
    }
    public ScreeningInterview addScreeningInterview(ScreeningInterview screeningInterview){
        screeningInterviewRepository.save(screeningInterview);
        return screeningInterview;
    }
    public ScreeningInterview updateScreeningInterview(Integer id, ScreeningInterview screeningInterview){
        Optional<ScreeningInterview> optionalStudent =  screeningInterviewRepository.findById(id);
        if(optionalStudent.isPresent()){
            ScreeningInterview st = optionalStudent.get();
            st.setName(screeningInterview.getName());
            st.setDate(screeningInterview.getDate());
            st.setEmail(screeningInterview.getEmail());
            st.setPhone(screeningInterview.getPhone());
            st.setResult(screeningInterview.getResult());
            screeningInterviewRepository.save(st);
            return st;
        }
        else{
            throw new NotFoundException("ScreeningInterview with the passed id Not Found");
        }
    }
    public Integer deleteScreeningInterview(Integer id){
        Optional<ScreeningInterview> optionalScreeningInterview = screeningInterviewRepository.findById(id);
        if(optionalScreeningInterview.isPresent()){
            screeningInterviewRepository.deleteById(id);
            return id;
        }
        else{
            throw new NotFoundException("ScreeningInterview with the passed id not Found!!");
        }
    }
}
