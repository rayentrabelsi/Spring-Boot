package tn.esprit.tpfoyer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Universite {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonProperty
    private Long idUniversite;
    @JsonProperty
    private String nomUniversite;
    @JsonProperty
    private String adresse;

    @OneToOne
    @JsonProperty
    private Foyer foyer;
}