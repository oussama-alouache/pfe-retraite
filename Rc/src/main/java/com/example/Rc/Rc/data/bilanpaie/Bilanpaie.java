package com.example.Rc.Rc.data.bilanpaie;

import com.example.Rc.Rc.data.common.Auditable;
import com.example.Rc.Rc.data.periode.Periode;
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
@Table(name = "bilanpaies")
public class Bilanpaie extends Auditable implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String etatpaie;
    private  String message;
    private  Double montatccp;
    private  Double montatnonccp;
    private  Integer montat_ccp;
    private  Integer nombreagentnonccp;
    private  Integer nombreagenttraiter;
    private  Integer nombretotalagent;
    private  Integer starttime;
    private String codesocial;
    private  String population;
    private Date annee;




    @OneToOne(optional=false)
    private Periode periode;








}
