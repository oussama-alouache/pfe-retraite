package com.example.Rc.Rc.data.paie_valorise_rubrique;

import com.example.Rc.Rc.data.common.Auditable;
import com.example.Rc.Rc.data.periode.Periode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Paie_valorise_rubriques")

public class Paie_valorise_rubrique extends Auditable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String adhernentcont;
    private String adhernentstat;
    private String assiette;
    private String Librub;
    private String list;
    private Double nombre;
    private String population;
    private String redres;
    private Double taux;
    private Double total;
    private String typrub;
    private String code_societe;
    private String matric;


    @OneToOne
    private Periode periode;




}
