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

public class Foyer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonProperty
    private Long idFoyer;
    @JsonProperty
    private String nomFoyer;
    @JsonProperty
    private Long capaciteFoyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    @JsonProperty
    private Set<Bloc> Blocs;

    @OneToOne(mappedBy=
            "foyer")
    @JsonProperty
    private Universite universite;

}