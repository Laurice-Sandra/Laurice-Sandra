package esprit.tn.springinfini3.serviceInterface;

import esprit.tn.springinfini3.entity.Piste;

import java.util.List;

public interface ServicePiste {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Long numPiste);
}
