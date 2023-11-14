package com.example.Rc.Rc.api;

import com.example.Rc.Rc.data.retraite.Retraite;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Rc.Rc.generic.genericControllers.GenericController;
import com.example.Rc.Rc.services.RetraiteService;

@RestController
@RequestMapping("api/v1/retraite")
public class RetraiteController extends GenericController<Retraite> {
    public RetraiteController(RetraiteService service) {
        super(service);
    }
}
