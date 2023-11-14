package com.example.Rc.Rc.data.element_paiment;


import com.example.Rc.Rc.data.common.Auditable;
import com.example.Rc.Rc.data.rebrique_paie.Rebrique_paie;
import com.example.Rc.Rc.data.retraite.Retraite;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "element_paiment")
public class Element_paiment extends Auditable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date_effet_rub;
    private Date date_fin_rub;
    private Double montat_rub;
    private String sens ;


    @ManyToOne
    private Rebrique_paie rebrique_paie;

    @ManyToOne
    private Retraite retraite;



}
