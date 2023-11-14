package com.example.Rc.Rc.data.service_rc;

import com.example.Rc.Rc.data.common.Auditable;
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
@Table(name = "Service_rcs")
public class Service_rc extends Auditable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private Integer code_serv;
    private String libelle_serv;





    @OneToMany(mappedBy = "service_rc")
    private Set<Retraite> retraites = new HashSet<>();
}
