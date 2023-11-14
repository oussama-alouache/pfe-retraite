package com.example.Rc.Rc.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Rc.Rc.data.bilanpaie.Bilanpaie;
import com.example.Rc.Rc.generic.genericControllers.GenericController;
import com.example.Rc.Rc.services.BilanService;

@CrossOrigin(value = "http://localhost:4200")
@RestController

@RequestMapping("api/v1/bilan")
public class BilanController extends GenericController<Bilanpaie> {
    public BilanController(BilanService service) {
        super(service);
    }
}
