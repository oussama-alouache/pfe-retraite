package com.example.Rc.Rc.data.fonction;

import com.example.Rc.Rc.data.retraite.Retraite;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.Rc.Rc.data.common.Auditable;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fonctions")

public class Fonction  extends Auditable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private Integer Code_fonct;
    private String libelle_fonct;


    @OneToMany(mappedBy = "fonction")
    private Set<Retraite> retraites = new HashSet<>();

}
