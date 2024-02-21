package esprit.tn.springinfini3.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance  ;
    private String ville;
    @OneToOne
    private Abonnement abonnement;

    @OneToMany(mappedBy = "skieur")
    private Set<Inscription> inscriptionSkieur;

    @ManyToMany(mappedBy = "skieurs")
    private Set<Piste> pistes;

}
