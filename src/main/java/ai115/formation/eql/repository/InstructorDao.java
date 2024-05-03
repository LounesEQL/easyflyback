package ai115.formation.eql.repository;

import ai115.formation.eql.entity.Instructor;
import ai115.formation.eql.entity.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InstructorDao extends JpaRepository<Instructor, Long>{
    Optional<Instructor> findById(Long id);
    List<Instructor> findByName(String name);
    List<Instructor> findByLicence(String licence);
}
