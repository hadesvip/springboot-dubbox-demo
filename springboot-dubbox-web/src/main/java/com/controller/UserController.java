package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyong on 2017/7/1.
 */

@RestController
public class UserController {

    @RequestMapping("/getUser")
    public String getUser() {
        return "hello,getUser...";
    }
}
