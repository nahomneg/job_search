package miu.edu.eaproject.persistence;

import miu.edu.eaproject.domain.ScreeningInterview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreeningInterviewRepository extends JpaRepository<ScreeningInterview,Integer> {
}
