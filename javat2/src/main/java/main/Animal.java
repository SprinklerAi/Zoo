package main;

import java.util.ArrayList;

public class Animal {
    
    private static String zoo;
    private String animal_name;
    private String species; 
    private int age;
    private static ArrayList<Animal> animals = new ArrayList<>();
    
    public Animal(String animal_name, String species, int age) {
        this.animal_name = animal_name;
        this.species = species;
        this.age = age;
    }
    
    public Animal() {
        this.animal_name = null;
        this.species = null;
        this.age = 0;
        animals.add(this);
    }

    public static void set_zoo(String zoo) {
        Animal.zoo = zoo;
    }

    public String get_zoo() {
        return zoo;
    }

    public String get_animal_name() {
        return animal_name;
    }

    public String get_species() {
        return species;
    }

    public int get_age() {
        return age;
    }
    
    public static  void list_animals() {
        for (Animal animal : Animal.animals) {
            System.out.println(animal.get_species() + ":" + animal.get_animal_name() + ", " + animal.get_age() + " vuotta");
        }
    }

    public static void run(int x) {
        if(x<1) {
            return;
        }
        for (Animal animal : animals) {
            System.out.println(animal.animal_name + " juoksee kovaa vauhtia!");
        }
        
        run(x - 1);
    }
    }
