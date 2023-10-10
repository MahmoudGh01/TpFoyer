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
public class Reservation {
    @Id

    private String IdReservation;

    private Date anneeUniversitaire;

    private boolean estValide ;

    @ManyToMany (cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
