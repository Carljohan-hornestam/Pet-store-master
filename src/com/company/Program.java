package com.company;

import java.util.ArrayList;
import java.util.List;

public class Program {
    PetNameGenerator generator = new PetNameGenerator();
    PetStore store = new PetStore();
    public List<Person> persons = new ArrayList<>();


    Program(){
        generator.readTextFile();
        store.createPets();
    }

    public void createPersons(){
        persons.add(new Person("Göran", 20));
        persons.add(new Person("Gustav", 20));
        persons.add(new Person("Alfred", 20));
        persons.add(new Person("Elsa", 20));
        persons.add(new Person("Else", 20));
        persons.add(new Person("Emil", 20));
        persons.add(new Person("Olle", 20));
        persons.add(new Person("Patrik", 20));
        persons.add(new Person("Vilma", 20));
        persons.add(new Person("Maja", 20));
        persons.add(new Person("Carro", 20));
        persons.add(new Person("Charlotte", 20));
        persons.add(new Person("Ulf", 20));
        persons.add(new Person("Evelina", 20));
        persons.add(new Person("Emma", 20));
        persons.add(new Person("Susanne", 20));
        persons.add(new Person("Kenneth", 20));
        persons.add(new Person("Kalle", 20));
        persons.add(new Person("Fredrik", 25));
        persons.add(new Person("Ludvig", 25));
    }
}
