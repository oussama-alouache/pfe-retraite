package com.example.Rc.Rc.api;

import com.example.Rc.Rc.data.filiale.Filiale;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Rc.Rc.generic.genericControllers.GenericController;
import com.example.Rc.Rc.services.FilialeService;

@RestController
@RequestMapping("api/v1/filiale")

public class FilialeController  extends GenericController<Filiale> {
    public FilialeController(FilialeService service) {
        super(service);
    }
}
