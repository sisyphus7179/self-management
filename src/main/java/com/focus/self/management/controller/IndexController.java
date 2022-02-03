package com.focus.self.management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: uu
 * @Date: 2022/2/3 9:40 PM
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "hello self management project!!!";
    }

}
