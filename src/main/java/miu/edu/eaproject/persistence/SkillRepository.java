package miu.edu.eaproject.persistence;

import miu.edu.eaproject.domain.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill,Integer> {
}
