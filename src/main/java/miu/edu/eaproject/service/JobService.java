package miu.edu.eaproject.service;

import miu.edu.eaproject.domain.Job;
import miu.edu.eaproject.exceptions.NotFoundException;
import miu.edu.eaproject.persistence.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }
    public Job getJobById(Integer id){
        Optional<Job> optionalJob = jobRepository.findById(id);
        if(optionalJob.isPresent()){
            return optionalJob.get();
        }
        else{
            throw new NotFoundException("Job with the passed id not Found!!");
        }
    }
    public Job addJob(Job job){
        jobRepository.save(job);
        return job;
    }
    public Job updateJob(Integer id, Job job){
        Optional<Job> optionalStudent =  jobRepository.findById(id);
        if(optionalStudent.isPresent()){
            Job st = optionalStudent.get();
            st.setSalary(job.getSalary());
            st.setSkills(job.getSkills());
            st.setTitle(job.getTitle());
            jobRepository.save(st);
            return st;
        }
        else{
            throw new NotFoundException("Job with the passed id Not Found");
        }
    }
    public Integer deleteJob(Integer id){
        Optional<Job> optionalJob = jobRepository.findById(id);
        if(optionalJob.isPresent()){
            jobRepository.deleteById(id);
            return id;
        }
        else{
            throw new NotFoundException("Job with the passed id not Found!!");
        }
    }
}
