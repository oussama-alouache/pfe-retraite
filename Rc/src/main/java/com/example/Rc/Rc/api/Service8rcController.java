package com.example.Rc.Rc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Rc.Rc.data.service_rc.Service_rc;
import com.example.Rc.Rc.generic.genericControllers.GenericController;
import com.example.Rc.Rc.services.Service_RcService;

@RestController
@RequestMapping("api/v1/service")
public class Service8rcController extends GenericController<Service_rc> {
    public Service8rcController(Service_RcService service) {
        super(service);
    }
}
