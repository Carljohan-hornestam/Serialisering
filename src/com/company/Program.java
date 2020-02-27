package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program {

    public Program(){
        createPerson();
        createSquare();
        createPet();
    }

    void createPerson(){
        Person person = new Person("Hej", "Person", 43);
        File file = new File("Serialized-objects/" + person.getFirstName() + ".txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s = "Serialized-objects/" + person.getFirstName() + ".txt";
        FileManager.serialize(person, s);
        FileManager.deSerialize(person, s);
    }

    void createSquare(){
        Square square = new Square(5, 10, "Kvadrat");
        File file = new File("Serialized-objects/" + square.getNameOfSquare() + ".txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s = "Serialized-objects/" + square.getNameOfSquare() + ".txt";
        FileManager.serialize(square, s);
        FileManager.deSerialize(square, s);
    }

    void createPet(){
        Pet pet = new Pet("Dog", "Meow", 3);
        File file = new File("Serialized-objects/" + pet.getType() + ".txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s = "Serialized-objects/" + pet.getType() + ".txt";
        FileManager.serialize(pet, s);
        FileManager.deSerialize(pet, s);
    }

}
