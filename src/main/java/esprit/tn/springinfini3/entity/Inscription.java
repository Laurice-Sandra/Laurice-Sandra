package esprit.tn.springinfini3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
@Entity
public class Inscription implements Serializable {
    @Id
    private  Long numInscription;
    private Integer numSemaine;
@ManyToOne
    private Skieur skieur;
@ManyToOne
    private Cours cours;

}
