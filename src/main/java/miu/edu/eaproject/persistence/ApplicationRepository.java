package miu.edu.eaproject.persistence;

import miu.edu.eaproject.domain.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application,Integer> {
}
