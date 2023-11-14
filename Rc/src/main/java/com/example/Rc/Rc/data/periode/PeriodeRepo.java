package com.example.Rc.Rc.data.periode;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PeriodeRepo extends JpaRepository<Periode , Integer> {


}