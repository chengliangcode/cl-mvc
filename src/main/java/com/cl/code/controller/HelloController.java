package com.cl.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chengliang
 * @since 2022/10/26 19:26
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/test")
    public void userData() {
        System.out.println("hello ".concat("test").concat("!!"));
    }

}
