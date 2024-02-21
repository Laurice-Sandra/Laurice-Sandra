package esprit.tn.springinfini3.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur ;
    private Integer longeur;
    private Integer pente;

    @ManyToMany
    private Set<Skieur> skieurs;


}

