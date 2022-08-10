package miu.edu.eaproject.controller;

import miu.edu.eaproject.domain.HiringManagerInterview;
import miu.edu.eaproject.service.HiringManagerInterviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HiringManagerController {
    private final HiringManagerInterviewService hiringManagerService;

    public HiringManagerController(HiringManagerInterviewService hiringManagerService) {
        this.hiringManagerService = hiringManagerService;
    }

    @GetMapping(path = "/hiringManagers")
    public List<HiringManagerInterview> getAllHiringManagerInterviews(){
        return hiringManagerService.getAllHiringManagerInterviews();
    }
    @GetMapping(path = "/hiringManagers/{id}")
    public HiringManagerInterview getHiringManagerInterview(@PathVariable Integer id){
        return hiringManagerService.getHiringManagerInterviewById(id);
    }
    @PostMapping(path = "/hiringManagers")
    public HiringManagerInterview postHiringManagerInterview(@RequestBody HiringManagerInterview hiringManager){
        return hiringManagerService.addHiringManagerInterview(hiringManager);
    }
    @PutMapping(path = "/hiringManagers/{id}")
    public HiringManagerInterview updateHiringManagerInterview(@PathVariable Integer id, @RequestBody HiringManagerInterview hiringManager){
        return hiringManagerService.updateHiringManagerInterview(id,hiringManager);
    }
    @DeleteMapping(path = "/hiringManager/{id}")
    public Integer deleteHiringManagerInterview(@PathVariable Integer id){
        return hiringManagerService.deleteHiringManagerInterview(id);
    }
}
