package esprit.tn.springinfini3.serviceInterface;

import esprit.tn.springinfini3.entity.Cours;

import java.util.List;

public interface ServiceCours {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
}
