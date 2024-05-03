package ai115.formation.eql.repository;

import ai115.formation.eql.entity.Maintenance;
import ai115.formation.eql.entity.Mechanic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface MaintenanceDao extends JpaRepository<Maintenance, Long> {

        Optional<Maintenance> findById(Long id);
        List<Maintenance> findByAircraftId(Long aircraftId);
        List<Maintenance> findByMechanic(Mechanic mechanic); // que faire ? transformer mechanic en entité ?


}
