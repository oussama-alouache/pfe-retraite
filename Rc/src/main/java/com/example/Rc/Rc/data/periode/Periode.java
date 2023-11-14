package com.example.Rc.Rc.data.periode;

import com.example.Rc.Rc.data.common.Auditable;
import com.example.Rc.Rc.data.virment.Virment;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.Rc.Rc.data.bilanpaie.Bilanpaie;
import com.example.Rc.Rc.data.paie_valorise_rubrique.Paie_valorise_rubrique;


import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "periodes")
public class Periode extends Auditable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer libelle;
    private Integer annee;
    private Integer mois;
    private Integer etat_saisie;
    private Integer etat_paie;


    @OneToOne(mappedBy = "periode",cascade = CascadeType.REMOVE)
    @JoinColumn(name = "periode_id")
    @JsonIgnore
    private Bilanpaie bilanpaie;

    @OneToOne(mappedBy = "periode",cascade = CascadeType.REMOVE)
    @JoinColumn(name = "periode_id")
    @JsonIgnore
    private Virment virment;

    @OneToOne(mappedBy = "periode",cascade = CascadeType.REMOVE)
    @JoinColumn(name = "periode_id")
    @JsonIgnore
    private Paie_valorise_rubrique paie_valorise_rubriques;


}
