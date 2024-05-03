package ai115.formation.eql.repository;

import ai115.formation.eql.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonDao extends JpaRepository<Person, Long> {

    Optional<Person> findByUsername(String username);
    Boolean existsByUsername(String username);



}
