package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangyong on 2017/7/1.
 */
@Controller
public class HomeController {


    @RequestMapping("/")
    public String home(HttpServletRequest request) {

        System.out.println("homeController....");
        request.setAttribute("hello", "index");

        return "index";
    }


}
