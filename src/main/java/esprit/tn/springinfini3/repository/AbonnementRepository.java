package esprit.tn.springinfini3.repository;

import esprit.tn.springinfini3.entity.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {
}
