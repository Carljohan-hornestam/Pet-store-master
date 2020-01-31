package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PetStore {
    PetNameGenerator generator = new PetNameGenerator();
    public List <Pet> pets = new ArrayList<>();

    public void createPets(){
        for (int i = 0; i < 100; i++){
            pets.add(new Pet(generator.generatePetName(), generator.generatePet()));
            System.out.println(pets.get(i));
        }
    }

}
