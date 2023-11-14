package com.example.Rc.Rc.data.bilanpaie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BilapaieRepo extends JpaRepository<Bilanpaie,Integer> {
    @Query(value = "select id , created_by , modified_at,modified_by,annee,codesocial,etatpaie,message,montat_ccp,montatnonccp,nombreagentnonccp" +
            ",nombreagenttraiter,nombretotalagent,population,starttime,periode_id from bilanpaies " ,nativeQuery=true)
    public List<Bilanpaie> findALLwithperiode();
    @Query("select p.libelle as code_periode,b.id,b.codesocial,b.etatpaie,b.message,b.montat_ccp,b.montatccp,b.montatnonccp,b.nombreagenttraiter,b.nombretotalagent,b.population,b.starttime  from Bilanpaie as b left join Periode as p where p.id =b.id")
    Optional<Bilanpaie> findwithperiodebyid(Integer id);


}

