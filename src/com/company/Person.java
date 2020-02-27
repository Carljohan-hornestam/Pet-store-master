package com.company;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Person {
    public String name;
    public int age;
    public List<Pet> ownedPets = new ArrayList<>();

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

    public List getOwnedPets(){return ownedPets;}


    @Override
    public String toString() {
        if(ownedPets.size() > 1){
            List<String> animalsAsString =
                    ownedPets.stream()
                    .collect(groupingBy(Pet::getType))
                    .entrySet().stream()
                    .map(e ->
                            e.getKey() + ": " + e.getValue().stream().map( pet -> pet.name ).collect(Collectors.joining(", "))
                    ).collect(Collectors.toList());

            return name.toUpperCase() + " " + "(" + age + ")" + " owns the animals: " + animalsAsString;
        }
        else if(ownedPets.size() == 1){
                return name + " " + "(" + age + ")" + " owns the animal: " + ownedPets.get(0).getType() +
                       ": " + ownedPets.get(0).getName();

        }
        else if (ownedPets.size() < 1) {
            return name + " " + "(" + age + ")" + " doesn't own any animals";
        }
        return "";
    }
}
