package com.example.Rc.Rc.api;

import com.example.Rc.Rc.data.rebrique_paie.Rebrique_paie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Rc.Rc.generic.genericControllers.GenericController;
import com.example.Rc.Rc.services.Rebrique_PaieService;

@RestController
@RequestMapping("api/v1/rebrique")
public class RebriquePaieController extends GenericController<Rebrique_paie> {
    public RebriquePaieController(Rebrique_PaieService service) {
        super(service);
    }
}
