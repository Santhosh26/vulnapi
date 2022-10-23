package com.app.vuln;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefXss {
    @GetMapping("/xss1/{data}")
    public String xss1(@PathVariable String data){
        return data;
    }
}
