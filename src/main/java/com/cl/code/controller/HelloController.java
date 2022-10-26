package com.cl.code.controller;

import com.alibaba.fastjson.JSON;
import com.cl.code.entity.UserData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengliang
 * @since 2022/10/26 19:26
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/{name}")
    public String userData(@PathVariable String name) {
        return JSON.toJSONString(new UserData(1L, name, 18));
    }

}
