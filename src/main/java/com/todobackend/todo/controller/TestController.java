package com.todobackend.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")  //리소스
public class TestController {

    @GetMapping
    public String testController() {
        return "Hello World!";
    }

}
