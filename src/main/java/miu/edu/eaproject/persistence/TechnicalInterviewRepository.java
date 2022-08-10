package miu.edu.eaproject.persistence;

import miu.edu.eaproject.domain.TechnicalInterview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicalInterviewRepository extends JpaRepository<TechnicalInterview,Integer> {
}
