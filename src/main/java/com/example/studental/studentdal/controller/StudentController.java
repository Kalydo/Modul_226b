package com.example.studental.studentdal.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class StudentController {
    @RequestMapping("/showLocation")
    public String showLocation(){
        return "createLocation";
    }
}
