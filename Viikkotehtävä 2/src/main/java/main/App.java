package main;

import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;

/**
 * Hello world1
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Hedgehog hedgehog = new Hedgehog();
        Scanner sc = new Scanner(System.in);
    
        boolean exit = false;
        while (!exit) {
            System.err.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
            
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch (i) {
                    case 1:
                        System.out.println("Mitä siili sanoo:");
                        String text = sc.nextLine();
                        if (text.length() == 0) {
                            System.out.println("Olen " + hedgehog.get_name() + " ja ikäni on " + hedgehog.get_age() + ", mutta antaisitko silti syötteen?");
                        } else {
                            hedgehog.speak(text);
                        }
                        break;
                    
                    case 2:
                        System.out.println("Anna siilin nimi: ");
                        String new_name = sc.nextLine();
                        hedgehog.set_name(new_name);
                        System.out.println("Anna siilin ikä: ");
                        int new_age = Integer.parseInt(sc.nextLine());
                        hedgehog.set_age(new_age);
                        break;
                    
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        int x = Integer.parseInt(sc.nextLine());
                        hedgehog.repeat_sentence(x);
                        break;
                    
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;

                    default:
                        System.out.println("Tuntematon valinta. Yritä uudestaan.");
                        break;
                }

            }
        }
    }
}
