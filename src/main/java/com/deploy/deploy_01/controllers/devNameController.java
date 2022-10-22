package com.deploy.deploy_01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devNameController {

    @GetMapping("")
    public String getDevName() {
        return "Mirko";
    }
}
