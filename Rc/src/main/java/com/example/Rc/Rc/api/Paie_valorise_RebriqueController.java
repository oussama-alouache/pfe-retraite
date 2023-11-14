package com.example.Rc.Rc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Rc.Rc.data.paie_valorise_rubrique.Paie_valorise_rubrique;
import com.example.Rc.Rc.generic.genericControllers.GenericController;
import com.example.Rc.Rc.services.Paie_Valorise_RebriqueService;

@RestController
@RequestMapping("api/v1/paie")
public class Paie_valorise_RebriqueController extends GenericController<Paie_valorise_rubrique> {
    public Paie_valorise_RebriqueController(Paie_Valorise_RebriqueService service) {
        super(service);
    }
}
