package com.example.Rc.Rc.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Rc.Rc.data.periode.Periode;
import com.example.Rc.Rc.generic.genericControllers.GenericController;
import com.example.Rc.Rc.services.PeriodeService;
@CrossOrigin(value = {"http://localhost:4200"})
@RestController
@RequestMapping("api/v1/periode")
public class PeriodeController extends GenericController<Periode> {
    public PeriodeController(PeriodeService service) {

        super(service);
    }


}
