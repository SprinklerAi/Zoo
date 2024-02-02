package main;

import java.util.ArrayList;
import java.util.Scanner;

/**

 */

public class App 
{
    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);

        Animal animal = new Animal();

        ArrayList<Animal> animals = new ArrayList<>();

        boolean exit = false;
        
        System.out.println("Anna eläintarhalle nimi:");
        animal.set_zoo(sc.nextLine());

        while (!exit) {
            System.err.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");
            
            if(sc.hasNextInt()) {
                int choice = sc.nextInt();
  
                switch (choice) {
                    case 1:
                        System.out.println("Mikä laji?");
                        String species = sc.next();
                        
                        System.out.println("Anna eläimen nimi: ");
                        String animal_name = sc.next();

                        System.out.println("Anna eläimen ikä: ");
                        int age = Integer.parseInt(sc.next());

                        animal.add_animals(animals, new Animal(animal_name, species, age));
                        break;

                    case 2:
                        animal.list_animals(animals);
                        break;
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        sc.nextLine();
                        int x = Integer.parseInt(sc.nextLine());
                        animal.run(x);
                        break;
                    
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;

                    default:
                        System.out.println("Syöte oli väärä.");
                        break;
                }

            }
        }
    }
}
