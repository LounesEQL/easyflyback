package ai115.formation.eql.repository;

import ai115.formation.eql.entity.ReservationDateInstr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReservationDateInstrDao extends JpaRepository <ReservationDateInstr, Long>{

    Optional<ReservationDateInstr> findById(Long id);
    List<ReservationDateInstrDao> findByInstructorId(Long id);

}
