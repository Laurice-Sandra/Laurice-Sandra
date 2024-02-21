package esprit.tn.springinfini3.serviceImp;

import esprit.tn.springinfini3.entity.Moniteur;
import esprit.tn.springinfini3.repository.MoniteurRepository;
import esprit.tn.springinfini3.serviceInterface.ServiceMoniteur;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceMoniteurImp implements ServiceMoniteur {
    MoniteurRepository moniteurRepository;
    @Override
   public List<Moniteur> retrieveAllMoniteurs(){
    return moniteurRepository.findAll();
   }
    @Override
    public Moniteur addMoniteur(Moniteur moniteur){

        return  moniteurRepository.save(moniteur);
    }
    @Override
    public Moniteur updateMoniteur (Moniteur moniteur){
        return  moniteurRepository.save(moniteur);
    }
    @Override
    public Moniteur retrieveMoniteur (Long numMoniteur){
         return moniteurRepository.findById(numMoniteur).orElse(null);
    }

}
