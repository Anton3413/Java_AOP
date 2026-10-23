package org.example.service;


import org.example.aop.Loggable;
import org.example.model.User;
import org.springframework.stereotype.Component;

@Component

public class UserService {



    @Loggable(name = "INFO", count = 3)
    public void saveUser(User user){
        System.out.println("Saving new user " + user.toString());
    }
}
