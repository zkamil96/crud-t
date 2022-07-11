package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {
    @Autowired
    private CrudService crudService;

    @GetMapping("/")
    public String hello() {
        return crudService.hello();
    }

}
