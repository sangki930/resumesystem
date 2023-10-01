package com.resume.backend.controller;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/testjava")
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("Hello JAVA", HttpStatus.OK);
    }
}
