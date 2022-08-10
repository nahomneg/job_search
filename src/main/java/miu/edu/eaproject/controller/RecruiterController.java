package miu.edu.eaproject.controller;

import miu.edu.eaproject.domain.Recruiter;
import miu.edu.eaproject.service.RecruiterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecruiterController {
    private final RecruiterService recruiterService;

    public RecruiterController(RecruiterService recruiterService) {
        this.recruiterService = recruiterService;
    }

    @GetMapping(path = "/recruiters")
    public List<Recruiter> getAllRecruiters(){
        return recruiterService.getAllRecruiters();
    }
    @GetMapping(path = "/recruiters/{id}")
    public Recruiter getRecruiter(@PathVariable Integer id){
        return recruiterService.getRecruiterById(id);
    }
    @PostMapping(path = "/recruiters")
    public Recruiter postRecruiter(@RequestBody Recruiter recruiter){
        return recruiterService.addRecruiter(recruiter);
    }
    @PutMapping(path = "/recruiters/{id}")
    public Recruiter updateRecruiter(@PathVariable Integer id, @RequestBody Recruiter recruiter){
        return recruiterService.updateRecruiter(id,recruiter);
    }
    @DeleteMapping(path = "/recruiter/{id}")
    public Integer deleteRecruiter(@PathVariable Integer id){
        return recruiterService.deleteRecruiter(id);
    }
}
