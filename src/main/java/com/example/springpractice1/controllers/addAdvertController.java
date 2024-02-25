package com.example.springpractice1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addAdvert")
public class addAdvertController
{
    @GetMapping
    public String addAdvert()
    {
        return "addAdvert";
    }
}
