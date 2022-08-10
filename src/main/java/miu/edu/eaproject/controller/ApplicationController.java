package miu.edu.eaproject.controller;

import miu.edu.eaproject.domain.Application;
import miu.edu.eaproject.persistence.ApplicationRepository;
import miu.edu.eaproject.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApplicationController {
    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping(path = "/applications")
    public List<Application> getAllApplications(){
        return applicationService.getAllApplications();
    }
    @GetMapping(path = "/applications/{id}")
    public Application getAllApplications(@PathVariable Integer id){
        return applicationService.getApplicationById(id);
    }
    @PostMapping(path = "/applications")
    public Application postApplication(@RequestBody Application application){
        return applicationService.addApplication(application);
    }
    @PutMapping(path = "/applications/{id}")
    public Application updateApplication(@PathVariable Integer id, @RequestBody Application application){
        return applicationService.updateApplication(id,application);
    }
    @DeleteMapping(path = "/application/{id}")
    public Integer deleteApplication(@PathVariable Integer id){
        return applicationService.deleteApplication(id);
    }
}
