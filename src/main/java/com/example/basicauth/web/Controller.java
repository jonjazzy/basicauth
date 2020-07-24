package com.example.basicauth.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class Controller
{
    @GetMapping(path="/test", produces = "application/json")
    public String getEmployees()
    {
        return "approved string";
    }
}
