package com.company;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class Program {
    PetNameGenerator generator = new PetNameGenerator();
    PetStore store = new PetStore(generator);
    private List<Person> persons = new ArrayList<>();


    Program(){
        generator.readTextFile();
        store.createPets();
        createPersons();
        store.buyPets(persons);
        printResult1();
        printResult2();
        printResult3();
    }

    public void createPersons(){
        persons.add(new Person("Göran", 20));
        persons.add(new Person("Gustav", 15));
        persons.add(new Person("Alfred", 43));
        persons.add(new Person("Elsa", 32));
        persons.add(new Person("Else", 17));
        persons.add(new Person("Emil", 69));
        persons.add(new Person("Olle", 55));
        persons.add(new Person("Patrik", 20));
        persons.add(new Person("Vilma", 25));
        persons.add(new Person("Maja", 27));
        persons.add(new Person("Carro", 19));
        persons.add(new Person("Charlotte", 18));
        persons.add(new Person("Ulf", 78));
        persons.add(new Person("Evelina", 20));
        persons.add(new Person("Emma", 21));
        persons.add(new Person("Susanne", 47));
        persons.add(new Person("Kenneth", 57));
        persons.add(new Person("Kalle", 33));
        persons.add(new Person("Fredrik", 25));
        persons.add(new Person("Ludvig", 74));
    }
    public void printResult1(){
        System.out.println("Result 1");
        persons.stream()
               .collect(Collectors.toList())
               .forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------------");
    }
    public void printResult2(){
        System.out.println("Result 2");
        persons.stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------------------------------------------------");
    }
    public void printResult3(){
        System.out.println("Result 3");
        persons.stream()
                .sorted(Comparator.comparing(person -> person.ownedPets.size()))
                .filter(s -> s.ownedPets.size() > 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
