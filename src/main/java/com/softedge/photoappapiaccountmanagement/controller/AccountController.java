package com.softedge.photoappapiaccountmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @GetMapping(value = "/status/check")
    public String status(){
        return "working";
    }
}
