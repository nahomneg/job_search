package miu.edu.eaproject.service;

import miu.edu.eaproject.domain.Application;
import miu.edu.eaproject.domain.Job;
import miu.edu.eaproject.persistence.ApplicationRepository;
import miu.edu.eaproject.persistence.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllApplications(){
        return jobRepository.findAll();
    }
}
