package com.app.vuln;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ReflectedXss {
    @GetMapping("/xss")
    public Response xss(@RequestParam String a) { return new Response (a);}
}
