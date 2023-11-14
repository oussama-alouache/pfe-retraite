package com.example.Rc.Rc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Rc.Rc.data.element_paiment.Element_paiment;
import com.example.Rc.Rc.generic.genericControllers.GenericController;
import com.example.Rc.Rc.services.Element_paimentService;


@RestController
@RequestMapping("api/v1/element")
public class Element_PaimentController extends GenericController<Element_paiment> {
    public Element_PaimentController(Element_paimentService service) {
        super(service);
    }
}

