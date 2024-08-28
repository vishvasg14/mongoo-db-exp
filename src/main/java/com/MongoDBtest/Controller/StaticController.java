package com.MongoDBtest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticController {

	@GetMapping("/index")
    public String home() {
        return "index"; 
    }
}
