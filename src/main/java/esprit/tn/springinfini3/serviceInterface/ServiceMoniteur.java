package esprit.tn.springinfini3.serviceInterface;

import esprit.tn.springinfini3.entity.Moniteur;

import java.util.List;

public interface ServiceMoniteur {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
}
