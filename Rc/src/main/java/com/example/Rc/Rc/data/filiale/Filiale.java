package com.example.Rc.Rc.data.filiale;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.Rc.Rc.data.bureau_gestionnaire.Bureau_gest;
import com.example.Rc.Rc.data.common.Auditable;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "filiales")
public class Filiale extends Auditable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String code_fil;
    private String adresse_fil;
    private String libelle_fil;
    private Integer fax ;
    private String num;

    @OneToMany(mappedBy = "filiale")
    private Set<Bureau_gest> bureau_gests = new HashSet<>();




}
