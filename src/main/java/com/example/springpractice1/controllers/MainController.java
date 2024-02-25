package com.example.springpractice1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aboutus")
public class MainController
{
    @GetMapping
    public String getMainPage()
    {return "about_us";}
}

//@Controller
//@RequestMapping("/")
//public class MainController
//{
//    @GetMapping
//    public String getMainPage()
//    {return "index";}
//}