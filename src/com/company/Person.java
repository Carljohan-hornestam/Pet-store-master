package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public String name;
    public int age;
    List<Pet> ownedPets = new ArrayList<>();

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}
