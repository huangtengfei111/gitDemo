package com.example.demo.annotation.serviceImpl;

import com.example.demo.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("userServiceAgeImpl")
public class UserServiceAgeImpl implements UserService {
    @Override
    public String select() {
        return "age 是18";
    }
}
