package com.example.demo.annotation.serviceImpl;

import com.example.demo.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 测试
 */
@Component
//@Primary
@Qualifier("userServiceNameImpl")
public class UserServiceNameImpl implements UserService {
    @Override
    public String select() {
        return "name 是张三";
    }
}
