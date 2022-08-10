package miu.edu.eaproject.service;

import miu.edu.eaproject.domain.HiringManagerInterview;
import miu.edu.eaproject.exceptions.NotFoundException;
import miu.edu.eaproject.persistence.HiringManagerInterviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HiringManagerInterviewService {
    final HiringManagerInterviewRepository skillRepository;

    public HiringManagerInterviewService(HiringManagerInterviewRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public List<HiringManagerInterview> getAllHiringManagerInterviews(){
        return skillRepository.findAll();
    }
    public HiringManagerInterview getHiringManagerInterviewById(Integer id){
        Optional<HiringManagerInterview> optionalHiringManagerInterview = skillRepository.findById(id);
        if(optionalHiringManagerInterview.isPresent()){
            return optionalHiringManagerInterview.get();
        }
        else{
            throw new NotFoundException("HiringManagerInterview with the passed id not Found!!");
        }
    }
    public HiringManagerInterview addHiringManagerInterview(HiringManagerInterview skill){
        skillRepository.save(skill);
        return skill;
    }
    public HiringManagerInterview updateHiringManagerInterview(Integer id, HiringManagerInterview skill){
        Optional<HiringManagerInterview> optionalStudent =  skillRepository.findById(id);
        if(optionalStudent.isPresent()){
            HiringManagerInterview st = optionalStudent.get();
            st.setStartDate(skill.getStartDate());
            st.setTeamSize(skill.getTeamSize());
            st.setEmail(skill.getEmail());
            st.setPhone(skill.getPhone());
            st.setDate(skill.getDate());
            skillRepository.save(st);
            return st;
        }
        else{
            throw new NotFoundException("HiringManagerInterview with the passed id Not Found");
        }
    }
    public Integer deleteHiringManagerInterview(Integer id){
        Optional<HiringManagerInterview> optionalHiringManagerInterview = skillRepository.findById(id);
        if(optionalHiringManagerInterview.isPresent()){
            skillRepository.deleteById(id);
            return id;
        }
        else{
            throw new NotFoundException("HiringManagerInterview with the passed id not Found!!");
        }
    }
}
