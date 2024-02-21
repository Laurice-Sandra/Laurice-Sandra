package esprit.tn.springinfini3.serviceImp;

import esprit.tn.springinfini3.entity.Piste;
import esprit.tn.springinfini3.repository.PisteRepository;
import esprit.tn.springinfini3.serviceInterface.ServicePiste;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@NoArgsConstructor
public class ServicePisteImp implements ServicePiste {
    PisteRepository pisteRepository;
    public List<Piste> retrieveAllPistes(){
        return pisteRepository.findAll();
    }
    public Piste addPiste(Piste piste){
        return pisteRepository.save(piste);
    }
    public Piste updatePiste (Piste piste){
        return pisteRepository.save(piste);
    }
    public Piste retrievePiste (Long numPiste){
        return pisteRepository.findById(numPiste).orElse(null);

    }
}
