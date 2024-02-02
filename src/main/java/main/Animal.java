package main;

import java.util.ArrayList;

public class Animal {
    
    private static String zoo;
    private String animal_name;
    private String species; 
    private int age;
    private ArrayList<Animal> animals = new ArrayList<>();
    
    public Animal(String animal_name, String species, int age) {
        this.animal_name = animal_name;
        this.species = species;
        this.age = age;
    }
    
    public Animal() {
        this(null, null, 0);
    }

    public void add_animals(ArrayList<Animal> animals, Animal new_animal) {
        if (new_animal.get_animal_name() != null || new_animal.get_species() != null || new_animal.get_age() != 0) {
         animal.add(new_animal);
        }
    }
    
    public void set_zoo(String zoo) {
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
    
    public  void list_animals(ArrayList<Animal> animals) {
        for (Animal animal : this.animals) {
            System.out.println(animal.get_species() + ":" + animal.get_animal_name() + ", " + animal.get_age() + " vuotta");
        }
    }

    public void run(int x) {
        if(x<1) {
            return;
        }
        for (Animal animal : animals) {
            System.out.println(animal.animal_name + " juoksee kovaa vauhtia!");
        }
        
        run(x - 1);
    }
    }
