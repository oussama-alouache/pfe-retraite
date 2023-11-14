package com.example.Rc.Rc.data.bureau_gestionnaire;

import com.example.Rc.Rc.data.common.Auditable;
import com.example.Rc.Rc.data.filiale.Filiale;
import com.example.Rc.Rc.data.retraite.Retraite;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bureau_gestionnaires")
public class Bureau_gest extends Auditable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private Integer code_bg;

    private String libelle_bg;

    @OneToMany(mappedBy = "bureau_gest")
    private Set<Retraite> retraites = new HashSet<>();

    @ManyToOne
    private Filiale filiale;



}
