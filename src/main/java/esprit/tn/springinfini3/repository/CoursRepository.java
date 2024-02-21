package esprit.tn.springinfini3.repository;

import esprit.tn.springinfini3.entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours,Long> {
}
