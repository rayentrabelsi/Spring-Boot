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

public class Chambre {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonProperty
    private Long idChambre;
    @JsonProperty
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    @JsonProperty
    private TypeChambre typeC;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonProperty
    private Set<Reservation> reservation;

    @ManyToOne
    @JsonProperty
    Bloc bloc;

}