package esprit.tn.springinfini3.repository;

import esprit.tn.springinfini3.entity.Piste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PisteRepository extends JpaRepository<Piste,Long> {
}
