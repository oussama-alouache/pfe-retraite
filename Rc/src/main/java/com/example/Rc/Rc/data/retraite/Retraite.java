package com.example.Rc.Rc.data.retraite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.Rc.Rc.data.bureau_gestionnaire.Bureau_gest;
import com.example.Rc.Rc.data.common.Auditable;
import com.example.Rc.Rc.data.element_paiment.Element_paiment;
import com.example.Rc.Rc.data.etat_presence.Etat_p;
import com.example.Rc.Rc.data.fonction.Fonction;
import com.example.Rc.Rc.data.service_rc.Service_rc;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity


@Table(name = "retraites")



public class Retraite extends Auditable implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;


    private String type;
    private String matricule;
    private String adresse;
    private Double assiete_cnr;
    private String cotient_fam;
    private Date date_effet;
    private Date date_naiss;
    private String email1;
    private String email2;
    private Double irg;
    private String lieu_naissance;
    private String matricule_fonct;
    private Integer mobile;
    private Integer mode_paiment;
    private Double montant_brut_rc;
    private Double nbr_annees_rc;
    private String num_compte;
    private String nom;
    private String prenom;
    private Double retenue;
    private Double taux_cnr;
    private Double taux_rc;
    private Double reparation;
    private Integer telephone;
    private String propos;
    private String motif;
    private Double revision;





    @OneToMany(mappedBy = "retraite")
    private Set<Element_paiment> element_paiments = new HashSet<>();


    @ManyToOne
    private Bureau_gest bureau_gest;


    @ManyToOne
    private Service_rc service_rc;

    @ManyToOne
    private Etat_p etat_p;

    @ManyToOne
    private Fonction fonction;


}





























