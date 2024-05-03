package ai115.formation.eql.repository;

import ai115.formation.eql.entity.ReservationStudent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReservationStudentDao extends JpaRepository <ReservationStudent, Long>{

    List<ReservationStudent> findByStudentPilotId(Long id);
    Optional<ReservationStudent> findById(Long id); // demander a l'equipe si c'est bien reservationId ou Id
    List<ReservationStudent> findByAircraftId(Long id);
    List<ReservationStudent> findByInstructorId(Long id);
}
