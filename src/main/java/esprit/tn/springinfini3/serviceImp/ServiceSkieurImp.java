package esprit.tn.springinfini3.serviceImp;

import esprit.tn.springinfini3.entity.Skieur;
import esprit.tn.springinfini3.repository.SkieurRepository;
import esprit.tn.springinfini3.serviceInterface.ServiceSkieur;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceSkieurImp implements ServiceSkieur {
    SkieurRepository skieurRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs(){
        return skieurRepository.findAll();
    }
    @Override
    public Skieur addSkieur(Skieur skieur){
        return skieurRepository.save(skieur);
    }
    @Override
    public void removeSkieur (Long numSkieur){
        skieurRepository.deleteById(numSkieur);
    }
    @Override
    public Skieur retrieveSkieur (Long numSkieur){
        return skieurRepository.findById(numSkieur).orElse(null);
    }

}
