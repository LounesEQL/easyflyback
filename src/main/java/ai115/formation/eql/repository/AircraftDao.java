package ai115.formation.eql.repository;

import ai115.formation.eql.entity.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AircraftDao extends JpaRepository<Aircraft, Long> {
    Optional<Aircraft> findById(Long id);
    List<Aircraft> findByModel(String model);
    List<Aircraft> findByType(String type);
    List<Aircraft> findByimmatriculation(String immatriculation);


}
