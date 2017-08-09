package com.example.chato.symbiosis;

/**
 * Created by chato on 8/5/2017.
 */

public class Person {
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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    String name;
    String age;
    String gender;
    String qualification;
    String occupation;
    String about;

    public Person(String name, String age, String gender, String qualification, String occupation, String about) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.qualification = qualification;
        this.occupation = occupation;
        this.about = about;
    }
}
