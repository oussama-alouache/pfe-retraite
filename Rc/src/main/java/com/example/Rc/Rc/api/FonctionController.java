package com.example.Rc.Rc.api;


import com.example.Rc.Rc.data.fonction.Fonction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Rc.Rc.generic.genericControllers.GenericController;
import com.example.Rc.Rc.services.FonctionService;
@RestController
@RequestMapping("api/v1/fonction")
public class FonctionController extends GenericController<Fonction> {
    public FonctionController(FonctionService service) {
        super(service);
    }
}
