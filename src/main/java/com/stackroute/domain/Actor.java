package com.stackroute.domain;

public class Actor {
    String name;
    String gender;
    int age;

    //setter injections
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void displayActor(){
        System.out.println("name:"  +name+ "\ngender:" +gender+ "\nage:" +age);
    }
}
