package com.example.abinash.dockerjenkinsdemo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerJenkinsController {

    @GetMapping("/")
    public String getMessage(){
        return "Docker Jenkins Demo";
    }
}
