package com.example.demo.annotation.controller;

import com.example.demo.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试 @Primary 和@Qualifier
 * 当UserService实现类有多个时，通过
 *
 * @Autowired UserService userServiceAgeImpl;
 * 也可以找到要调用的bean是哪一个 先byType，在byName，这时自动装配的属性名不能乱写
 */

@RestController
public class TestController {

    @Autowired
    @Qualifier("userServiceAgeImpl")
    //UserService userServiceAgeImpl;
            UserService userService;


    @GetMapping("/test")
    public String test1() {
        System.out.println(userService.select());
        return "11111";
    }


}


