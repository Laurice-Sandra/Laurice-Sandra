package esprit.tn.springinfini3.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long numCours;
    private Integer niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typecours ;
    @Enumerated(EnumType.STRING)
    private Support support ;
    private Float prix;
    private Integer creneau ;
    @OneToMany(mappedBy = "cours")
    private Set<Inscription> inscriptionCours;










}
