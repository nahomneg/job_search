package miu.edu.eaproject.controller;

import miu.edu.eaproject.domain.TechnicalInterview;
import miu.edu.eaproject.service.TechnicalInterviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TechnicalInterviewController {
    private final TechnicalInterviewService technicalInterviewService;

    public TechnicalInterviewController(TechnicalInterviewService technicalInterviewService) {
        this.technicalInterviewService = technicalInterviewService;
    }

    @GetMapping(path = "/technicalInterviews")
    public List<TechnicalInterview> getAllTechnicalInterviews(){
        return technicalInterviewService.getAllTechnicalInterviews();
    }
    @GetMapping(path = "/technicalInterviews/{id}")
    public TechnicalInterview getTechnicalInterview(@PathVariable Integer id){
        return technicalInterviewService.getTechnicalInterviewById(id);
    }
    @PostMapping(path = "/technicalInterviews")
    public TechnicalInterview postTechnicalInterview(@RequestBody TechnicalInterview technicalInterview){
        return technicalInterviewService.addTechnicalInterview(technicalInterview);
    }
    @PutMapping(path = "/technicalInterviews/{id}")
    public TechnicalInterview updateTechnicalInterview(@PathVariable Integer id, @RequestBody TechnicalInterview technicalInterview){
        return technicalInterviewService.updateTechnicalInterview(id,technicalInterview);
    }
    @DeleteMapping(path = "/technicalInterview/{id}")
    public Integer deleteTechnicalInterview(@PathVariable Integer id){
        return technicalInterviewService.deleteTechnicalInterview(id);
    }
}
