package esprit.tn.springinfini3.repository;

import esprit.tn.springinfini3.entity.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkieurRepository extends JpaRepository<Skieur,Long> {
}
