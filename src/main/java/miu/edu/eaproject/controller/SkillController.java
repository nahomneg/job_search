package miu.edu.eaproject.controller;

import miu.edu.eaproject.domain.Skill;
import miu.edu.eaproject.service.SkillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SkillController {
    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping(path = "/skills")
    public List<Skill> getAllSkills(){
        return skillService.getAllSkills();
    }
    @GetMapping(path = "/skills/{id}")
    public Skill getSkill(@PathVariable Integer id){
        return skillService.getSkillById(id);
    }
    @PostMapping(path = "/skills")
    public Skill postSkill(@RequestBody Skill skill){
        return skillService.addSkill(skill);
    }
    @PutMapping(path = "/skills/{id}")
    public Skill updateSkill(@PathVariable Integer id, @RequestBody Skill skill){
        return skillService.updateSkill(id,skill);
    }
    @DeleteMapping(path = "/skill/{id}")
    public Integer deleteSkill(@PathVariable Integer id){
        return skillService.deleteSkill(id);
    }
}
