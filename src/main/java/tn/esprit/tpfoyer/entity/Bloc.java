package tn.esprit.tpfoyer.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
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
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonProperty
    private long idBloc;
    @JsonProperty
    private String nomBloc;
    @JsonProperty
    private long capaciteBloc;

    @ManyToOne
    @JsonProperty
    Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    @JsonProperty
    private Set<Chambre> Chambres;

}
