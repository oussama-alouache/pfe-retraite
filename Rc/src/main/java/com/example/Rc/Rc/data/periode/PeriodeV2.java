package com.example.Rc.Rc.data.periode;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "periodes")
public class PeriodeV2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;;
    private Integer libelle;
    private Integer annee;
    private Integer mois;
    private Integer etat_saisie;
    private Integer etat_paie;
    private Date date_ceation;
    private Integer creater;
    private Integer updater;
    private Date date_update;




}
