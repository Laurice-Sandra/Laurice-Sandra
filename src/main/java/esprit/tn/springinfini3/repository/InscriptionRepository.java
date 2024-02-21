package esprit.tn.springinfini3.repository;

import esprit.tn.springinfini3.entity.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
