package com.example.Rc.Rc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Rc.Rc.data.etat_presence.Etat_p;
import com.example.Rc.Rc.generic.genericControllers.GenericController;
import com.example.Rc.Rc.services.Etat_presenceService;

@RestController
@RequestMapping("api/v1/etat")
public class Etat_PresenceController extends GenericController<Etat_p> {
    public Etat_PresenceController(Etat_presenceService service) {
        super(service);
    }
}
