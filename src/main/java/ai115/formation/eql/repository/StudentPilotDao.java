package ai115.formation.eql.repository;

import ai115.formation.eql.entity.StudentPilot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentPilotDao extends JpaRepository<StudentPilot, Long> {

    Optional<StudentPilot> findById(Long id);
    List<StudentPilot> findByName(String name);
    List<StudentPilot> findByPromotionId(Long id);
    List<StudentPilot> findByLicence(String licence);
}
