package esprit.tn.springinfini3.serviceImp;

import esprit.tn.springinfini3.entity.Cours;
import esprit.tn.springinfini3.entity.Piste;
import esprit.tn.springinfini3.repository.CoursRepository;
import esprit.tn.springinfini3.repository.PisteRepository;
import esprit.tn.springinfini3.serviceInterface.ServiceCours;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceCoursImp implements ServiceCours {
    CoursRepository coursRepository;
    public List<Cours> retrieveAllCourses(){
        return coursRepository.findAll();
    }
    public Cours addCours(Cours cours){
        return coursRepository.save(cours);
    }
    public Cours updateCours (Cours cours){
        return coursRepository.save(cours);
    }
    public Cours retrieveCours (Long numCours){
        return coursRepository.findById(numCours).orElse(null);

    }

}
