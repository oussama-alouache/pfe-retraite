package com.example.Rc.Rc.data.rebrique_paie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.example.Rc.Rc.data.common.Auditable;
import com.example.Rc.Rc.data.element_paiment.Element_paiment;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "Rebrique_paies")
public class Rebrique_paie extends Auditable implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String type;
    private String code_rub;
    private String adherent_cont;
    private String adherent_stat;
    private String assiette;
    private String libelle_rub;
    private String liste;
    private String redes;
    private String typrub;





    @OneToMany(mappedBy = "rebrique_paie")
    private Set<Element_paiment> element_paiments = new HashSet<>();

}

