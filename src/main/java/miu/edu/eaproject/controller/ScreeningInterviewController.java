package miu.edu.eaproject.controller;

import miu.edu.eaproject.domain.ScreeningInterview;
import miu.edu.eaproject.service.ScreeningInterviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScreeningInterviewController {
    private final ScreeningInterviewService screeningInterviewService;

    public ScreeningInterviewController(ScreeningInterviewService screeningInterviewService) {
        this.screeningInterviewService = screeningInterviewService;
    }

    @GetMapping(path = "/screeningInterviews")
    public List<ScreeningInterview> getAllScreeningInterviews(){
        return screeningInterviewService.getAllScreeningInterviews();
    }
    @GetMapping(path = "/screeningInterviews/{id}")
    public ScreeningInterview getScreeningInterview(@PathVariable Integer id){
        return screeningInterviewService.getScreeningInterviewById(id);
    }
    @PostMapping(path = "/screeningInterviews")
    public ScreeningInterview postScreeningInterview(@RequestBody ScreeningInterview screeningInterview){
        return screeningInterviewService.addScreeningInterview(screeningInterview);
    }
    @PutMapping(path = "/screeningInterviews/{id}")
    public ScreeningInterview updateScreeningInterview(@PathVariable Integer id, @RequestBody ScreeningInterview screeningInterview){
        return screeningInterviewService.updateScreeningInterview(id,screeningInterview);
    }
    @DeleteMapping(path = "/screeningInterview/{id}")
    public Integer deleteScreeningInterview(@PathVariable Integer id){
        return screeningInterviewService.deleteScreeningInterview(id);
    }
}
