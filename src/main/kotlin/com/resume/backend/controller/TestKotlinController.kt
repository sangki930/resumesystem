package com.resume.backend.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestKotlinController {
    @GetMapping("/test")
    fun test(): ResponseEntity<String> {
        return ResponseEntity<String>(/* body = */ "Hello World!!",/* status = */ HttpStatus.OK)
    }

}