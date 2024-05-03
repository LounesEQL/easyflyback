package ai115.formation.eql.repository;

import ai115.formation.eql.entity.ReservationPilot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReservationPilotDao extends JpaRepository<ReservationPilot, Long>{
    List<ReservationPilot> findByPilotId(Long id);
    Optional<ReservationPilot> findById(Long id); // demander a l'equipe si c'est bien reservationId ou Id
    List<ReservationPilot> findByAircraftId(Long id);
}
