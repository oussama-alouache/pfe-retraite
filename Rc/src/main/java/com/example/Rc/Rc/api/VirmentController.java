package com.example.Rc.Rc.api;

import com.example.Rc.Rc.data.virment.Virment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Rc.Rc.generic.genericControllers.GenericController;
import com.example.Rc.Rc.services.VirmentService;


@RestController
@RequestMapping("api/v1/virment")
public class VirmentController extends GenericController<Virment> {
    public VirmentController(VirmentService service) {
        super(service);
    }
}
