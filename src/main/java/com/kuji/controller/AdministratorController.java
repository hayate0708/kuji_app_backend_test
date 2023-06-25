package com.kuji.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kuji.domain.AdministratorDomain;
import com.kuji.entity.Administrator;

@RestController
public class AdministratorController {

    @Autowired
    private AdministratorDomain domain;

    @GetMapping("/administrator")
    public Administrator getAdministrator(@RequestParam String id, @RequestParam String password)
            throws Exception {
        return new Administrator(domain.getAdministrator(id, password));
    }

}
