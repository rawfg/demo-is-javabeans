package com.example.javabeans.demoisjavabeans;


import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<Hello> sayHello() {
        final Hello hello = new Hello("hello world", true);
        hello.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(HelloController.class).sayHello()).withSelfRel());
        return ResponseEntity.ok(hello);
    }
}
