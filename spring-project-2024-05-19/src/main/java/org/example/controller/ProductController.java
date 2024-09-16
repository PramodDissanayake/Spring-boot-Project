package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@Slf4j
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    StudentService studentServiceOne;
    @Autowired
    StudentService studentServiceTwo;

//    ProductController(StudentService studentService){
//        this.studentServiceOne = studentService;
//    }
    @GetMapping("/all/{name}")
    Map<String, String> getStudent(@PathVariable String name){
        log.info(name);
        return studentServiceOne.getStudent();

    }
}
