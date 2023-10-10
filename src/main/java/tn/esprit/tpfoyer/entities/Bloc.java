package tn.esprit.tpfoyer.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;

    private String nomBloc;
    private long capaciteBloc;
    @ManyToOne
    private Foyer foyer;

    @OneToMany (cascade = CascadeType.ALL , mappedBy= "bloc")
    private Set<Chambre> chambre ;
}
