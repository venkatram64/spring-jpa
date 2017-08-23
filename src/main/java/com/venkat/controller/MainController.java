package com.venkat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by venkatram.veerareddy on 8/23/2017.
 */

@Controller
public class MainController {

    @GetMapping("/")
    public String home(){
        return "index";
    }
}
