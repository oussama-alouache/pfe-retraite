package com.example.Rc.Rc.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Rc.Rc.data.bureau_gestionnaire.Bureau_gest;
import com.example.Rc.Rc.generic.genericControllers.GenericController;
import com.example.Rc.Rc.services.Buerea_GesService;
@CrossOrigin(value = {"http://localhost:4200"})


@RestController
@RequestMapping("api/v1/bureau")
public class Bureau_gestionnaireController extends GenericController<Bureau_gest> {
    public Bureau_gestionnaireController(Buerea_GesService service) {
        super(service);
    }
}
