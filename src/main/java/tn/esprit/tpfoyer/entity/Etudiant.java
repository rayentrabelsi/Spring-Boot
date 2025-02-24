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

public class Etudiant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonProperty
    private Long idEtudiant;
    @JsonProperty
    private String nomEt;
    @JsonProperty
    private String prenomEt;
    @JsonProperty
    private long cin;
    @JsonProperty
    private String ecole;
    @JsonProperty
    private Date dateNaissance;

    @ManyToMany(mappedBy="etudiants", cascade = CascadeType.ALL)
    @JsonProperty
    private Set<Reservation> reservations;


}
