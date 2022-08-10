package miu.edu.eaproject.service;

import miu.edu.eaproject.domain.Application;
import miu.edu.eaproject.exceptions.NotFoundException;
import miu.edu.eaproject.persistence.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {
    final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<Application> getAllApplications(){
        return applicationRepository.findAll();
    }
    public Application getApplicationById(Integer id){
        Optional<Application> optionalApplication = applicationRepository.findById(id);
        if(optionalApplication.isPresent()){
            return optionalApplication.get();
        }
        else{
            throw new NotFoundException("Application with the passed id not Found!!");
        }
    }
    public Application addApplication(Application application){
        applicationRepository.save(application);
        return application;
    }
    public Application updateApplication(Integer id, Application application){
        Optional<Application> optionalStudent =  applicationRepository.findById(id);
        if(optionalStudent.isPresent()){
            Application st = optionalStudent.get();
            st.setResumeVersion(application.getResumeVersion());
            applicationRepository.save(st);
            return st;
        }
        else{
            throw new NotFoundException("Application with the passed id Not Found");
        }
    }
    public Integer deleteApplication(Integer id){
        Optional<Application> optionalApplication = applicationRepository.findById(id);
        if(optionalApplication.isPresent()){
            applicationRepository.deleteById(id);
            return id;
        }
        else{
            throw new NotFoundException("Application with the passed id not Found!!");
        }
    }
}
