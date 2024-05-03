package ai115.formation.eql.repository;

import ai115.formation.eql.entity.Instructor;
import ai115.formation.eql.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PromotionDao extends JpaRepository <Promotion, Long>{

    Optional<Promotion> findById(Long id);
    List<Promotion> findByName(String Name);
    Promotion findByInstructorName(String instructorName);
}
