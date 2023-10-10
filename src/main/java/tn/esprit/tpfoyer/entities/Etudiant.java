package tn.esprit.tpfoyer.entities;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdEtudiant;
    private String nomEt,prenomEt;
    private long cin;
    private String ecole;
    private Date dateNaissance;

    @ManyToMany (mappedBy = "etudiants",cascade = CascadeType.ALL)
    private Set<Reservation> reservation;

}
