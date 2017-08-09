package com.example.chato.symbiosis;

/**
 * Created by chato on 8/9/2017.
 */

public class ShortPerson {
    String name;
    String age;
    String gender;

    public ShortPerson(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
