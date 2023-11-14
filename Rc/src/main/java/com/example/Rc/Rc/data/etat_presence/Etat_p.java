package com.example.Rc.Rc.data.etat_presence;
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
@Table(name = "etat_presences")
public class Etat_p  extends Auditable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String prepos;


    @OneToMany(mappedBy = "etat_p")
    private Set<Retraite> retraites = new HashSet<>();
}
