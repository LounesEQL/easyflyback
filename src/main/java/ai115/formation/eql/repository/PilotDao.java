package ai115.formation.eql.repository;

import ai115.formation.eql.entity.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PilotDao extends JpaRepository<Pilot, Long> {
        Optional<Pilot> findById(Long id);
        List<Pilot> findByName(String name);
        List<Pilot> findByLicence(String licence);


}
