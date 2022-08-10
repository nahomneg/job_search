package miu.edu.eaproject.persistence;

import miu.edu.eaproject.domain.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter,Integer> {
}
