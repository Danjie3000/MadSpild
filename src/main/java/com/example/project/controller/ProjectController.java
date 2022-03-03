package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

  @GetMapping("/index")
  public String index(){
    return "page1.5";
  }

  @GetMapping("/page1")
  public String page1(){
    return "page1";
  }

  @GetMapping("/page2")
  public String page2(){
    return "index";
  }
}
