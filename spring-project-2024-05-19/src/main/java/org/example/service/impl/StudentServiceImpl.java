package org.example.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.service.StudentService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;
@Slf4j
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Service
public class StudentServiceImpl implements StudentService {

    StudentServiceImpl(){
        log.info("Object is loaded");
    }
    public Map<String, String> getStudent(){
        return Collections.singletonMap("name", "shakthi");
    }
}
