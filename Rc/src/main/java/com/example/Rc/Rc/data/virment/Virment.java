package com.example.Rc.Rc.data.virment;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.Rc.Rc.data.common.Auditable;
import com.example.Rc.Rc.data.periode.Periode;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Virments")

public class Virment extends Auditable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String matirc;
    private String adresse;
    private Double ass_exrecice;
    private Double ass_gain;
    private Double ass_irg_red;
    private Double ass_net;
    private Double ass_ret;
    private Boolean etat_vim
            ;
    private Integer mode_paiment;
    private String nom;
    private Integer num_compte;



    @OneToOne
    private Periode periode;










}
