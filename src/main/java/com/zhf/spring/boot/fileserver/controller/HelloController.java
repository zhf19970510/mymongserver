package com.zhf.spring.boot.fileserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello World 控制器
 * @author ZengHongFa
 * @create 2020/3/2 0002 21:08
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World! Welcome to visit waylau.com!";
    }
}