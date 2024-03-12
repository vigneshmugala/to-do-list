package com.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoListController {
   @GetMapping("/hello")
   public String helloWorld()
   {
       return "Hello World";
   }

}
