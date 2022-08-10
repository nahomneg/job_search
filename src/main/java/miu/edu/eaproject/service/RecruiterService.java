package miu.edu.eaproject.service;

import miu.edu.eaproject.domain.Recruiter;
import miu.edu.eaproject.exceptions.NotFoundException;
import miu.edu.eaproject.persistence.RecruiterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecruiterService {
    final RecruiterRepository recruiterRepository;

    public RecruiterService(RecruiterRepository recruiterRepository) {
        this.recruiterRepository = recruiterRepository;
    }

    public List<Recruiter> getAllRecruiters(){
        return recruiterRepository.findAll();
    }
    public Recruiter getRecruiterById(Integer id){
        Optional<Recruiter> optionalRecruiter = recruiterRepository.findById(id);
        if(optionalRecruiter.isPresent()){
            return optionalRecruiter.get();
        }
        else{
            throw new NotFoundException("Recruiter with the passed id not Found!!");
        }
    }
    public Recruiter addRecruiter(Recruiter recruiter){
        recruiterRepository.save(recruiter);
        return recruiter;
    }
    public Recruiter updateRecruiter(Integer id, Recruiter recruiter){
        Optional<Recruiter> optionalStudent =  recruiterRepository.findById(id);
        if(optionalStudent.isPresent()){
            Recruiter st = optionalStudent.get();
            st.setName(recruiter.getName());
            st.setAddress(recruiter.getAddress());
            st.setClients(recruiter.getClients());
            st.setName(recruiter.getName());
            recruiterRepository.save(st);
            return st;
        }
        else{
            throw new NotFoundException("Recruiter with the passed id Not Found");
        }
    }
    public Integer deleteRecruiter(Integer id){
        Optional<Recruiter> optionalRecruiter = recruiterRepository.findById(id);
        if(optionalRecruiter.isPresent()){
            recruiterRepository.deleteById(id);
            return id;
        }
        else{
            throw new NotFoundException("Recruiter with the passed id not Found!!");
        }
    }
}
