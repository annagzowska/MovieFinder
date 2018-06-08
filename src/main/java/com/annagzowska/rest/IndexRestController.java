package com.annagzowska.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class IndexRestController {

    @RequestMapping(path = "/")
    public String index(Map<String, Object> model){
        return "index";
    }
}
