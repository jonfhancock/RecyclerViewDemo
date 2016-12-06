package com.jonfhancock.recyclerviewdemo;

/**
 * Created by jonhancock on 12/5/16.
 */

public class DataModel {
    String firstName;
    String lastName;
    int age;

    public DataModel(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "DataModel{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

}
