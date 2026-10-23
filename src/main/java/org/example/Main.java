package org.example;

import org.example.model.User;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example");

        var userService =  context.getBean(UserService.class);

        userService.saveUser(context.getBean(User.class));

    }
}
