package com.annagzowska.rest;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorRestController implements ErrorController {

    @RequestMapping(path = "/error")
    public String error() {
        return "Error page";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
