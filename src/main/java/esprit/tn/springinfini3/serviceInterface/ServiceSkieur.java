package esprit.tn.springinfini3.serviceInterface;

import esprit.tn.springinfini3.entity.Skieur;

import java.util.List;

public interface ServiceSkieur {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);
}
