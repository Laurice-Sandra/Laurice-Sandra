package esprit.tn.springinfini3.repository;

import esprit.tn.springinfini3.entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<Cours,Long> {
}
