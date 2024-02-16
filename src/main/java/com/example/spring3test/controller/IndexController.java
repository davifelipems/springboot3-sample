package com.example.spring3test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class IndexController {

    @GetMapping(value = "/ok")
    public ResponseEntity<String> findByContext() {
        return ResponseEntity.ok("ok");
    }
}
