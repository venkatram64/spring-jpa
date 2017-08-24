package com.venkat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by venkatram.veerareddy on 8/23/2017.
 */

@Controller
public class MainController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
