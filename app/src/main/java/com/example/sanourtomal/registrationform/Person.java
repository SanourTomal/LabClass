package com.example.sanourtomal.registrationform;

/**
 * Created by Sanour Tomal on 9/26/2017.
 */

public class Person {
    private String name;
    private String pass;

    public Person(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }
}
