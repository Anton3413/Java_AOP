package org.example.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

    public User(@Value("24") int age,
                @Value("Anton") String name,
                @Value("Germany") String country) {
        this.age = age;
        this.name = name;
        this.country = country;
    }

    private final int age;

    private final String name;

    private final String country;


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
