package miu.edu.eaproject.persistence;

import miu.edu.eaproject.domain.HiringManagerInterview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HiringManagerInterviewRepository extends JpaRepository<HiringManagerInterview,Integer> {
}
