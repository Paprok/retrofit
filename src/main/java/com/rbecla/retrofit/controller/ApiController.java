package com.rbecla.retrofit.controller;

import com.rbecla.retrofit.model.Status;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = EndpointPath.PATH, produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiController {

    @GetMapping("/status")
    public Status getStatus(){
        return new Status("some data");
    }
}
