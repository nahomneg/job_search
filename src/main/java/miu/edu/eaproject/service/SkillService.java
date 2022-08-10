package miu.edu.eaproject.service;

import miu.edu.eaproject.domain.Skill;
import miu.edu.eaproject.exceptions.NotFoundException;
import miu.edu.eaproject.persistence.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {
    final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public List<Skill> getAllSkills(){
        return skillRepository.findAll();
    }
    public Skill getSkillById(Integer id){
        Optional<Skill> optionalSkill = skillRepository.findById(id);
        if(optionalSkill.isPresent()){
            return optionalSkill.get();
        }
        else{
            throw new NotFoundException("Skill with the passed id not Found!!");
        }
    }
    public Skill addSkill(Skill skill){
        skillRepository.save(skill);
        return skill;
    }
    public Skill updateSkill(Integer id, Skill skill){
        Optional<Skill> optionalStudent =  skillRepository.findById(id);
        if(optionalStudent.isPresent()){
            Skill st = optionalStudent.get();
            st.setDescription(skill.getDescription());
            st.setExperience(skill.getExperience());
            st.setLanguage(skill.getLanguage());
            st.setName(skill.getName());
            skillRepository.save(st);
            return st;
        }
        else{
            throw new NotFoundException("Skill with the passed id Not Found");
        }
    }
    public Integer deleteSkill(Integer id){
        Optional<Skill> optionalSkill = skillRepository.findById(id);
        if(optionalSkill.isPresent()){
            skillRepository.deleteById(id);
            return id;
        }
        else{
            throw new NotFoundException("Skill with the passed id not Found!!");
        }
    }
}
