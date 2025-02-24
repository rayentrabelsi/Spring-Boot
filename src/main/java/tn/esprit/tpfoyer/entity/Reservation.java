package tn.esprit.tpfoyer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Reservation {
    @Id
    @JsonProperty
    private String idReservation;
    @JsonProperty
    private Date anneeUniversitaire;
    @JsonProperty
    private boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonProperty
    private Set<Etudiant> etudiants;
}