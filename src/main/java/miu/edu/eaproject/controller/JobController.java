package miu.edu.eaproject.controller;

import miu.edu.eaproject.domain.Job;
import miu.edu.eaproject.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping(path = "/jobs")
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }
    @GetMapping(path = "/jobs/{id}")
    public Job getJob(@PathVariable Integer id){
        return jobService.getJobById(id);
    }
    @PostMapping(path = "/jobs")
    public Job postJob(@RequestBody Job job){
        return jobService.addJob(job);
    }
    @PutMapping(path = "/jobs/{id}")
    public Job updateJob(@PathVariable Integer id, @RequestBody Job job){
        return jobService.updateJob(id,job);
    }
    @DeleteMapping(path = "/job/{id}")
    public Integer deleteJob(@PathVariable Integer id){
        return jobService.deleteJob(id);
    }
}
