package esprit.tn.springinfini3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Moniteur implements Serializable {
    @Id
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;
@OneToMany
    private Set<Cours> cours;
}
