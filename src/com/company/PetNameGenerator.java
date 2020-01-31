package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PetNameGenerator {
    String petName;
    public List<String> petNames = new ArrayList<>();
    public String[] pets = new String[]{"Dog", "Cat", "Lion", "Tiger", "Beaver"};

    public String[] getPets(){
        return pets;
    }

    public void readTextFile() {
        try {
            petNames = Files.lines(Paths.get("pet-names.txt"))
                    .flatMap( s -> Stream.of(s.split(", ")) )
                    .collect(Collectors.toList());;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String generatePet(){
        int i = (int) (Math.random() * 5);
        System.out.println(pets[i]);
        return pets[i];
    }

    public String generatePetName(){
        int i = (int) (Math.random() * petNames.size());
        petName = petNames.get(i);
        return petName;
    }

}
