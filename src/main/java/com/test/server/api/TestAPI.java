package com.test.server.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestAPI {
    @GetMapping()
    public String test()
    {
        return "Success";
    }
}
