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
    PetNameGenerator generator;

    public PetStore(PetNameGenerator generator){
        this.generator = generator;
    }
    public List <Pet> pets = new ArrayList<>();

    public void createPets(){
        for (int i = 0; i < 100; i++){
            pets.add(new Pet(generator.generatePetName(), generator.generatePet()));
        }
    }
    public void buyPets(List<Person> persons){
        for(Person person : persons){
            int i = (int) (Math.random() * 5);
            for (int j = 0; j <= i; j++){
                int randomAnimal = (int) (Math.random() * pets.size());
                person.ownedPets.add(pets.get(randomAnimal));
                pets.remove(randomAnimal);
            }
        }
    }
}
