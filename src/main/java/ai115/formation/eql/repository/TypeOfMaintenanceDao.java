package ai115.formation.eql.repository;

import ai115.formation.eql.entity.TypeOfMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TypeOfMaintenanceDao extends JpaRepository<TypeOfMaintenance, Long> {
    Optional<TypeOfMaintenance> findById(Long id);
    TypeOfMaintenanceDao findByType(String type);
}
