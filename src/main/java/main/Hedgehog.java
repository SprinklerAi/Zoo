package main;

public class Hedgehog {

    private String name;
    private int age;

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Hedgehog() {
        this.name = "Pikseli";
        this.age = 5;
    
    }

    public void speak(String text) {
        System.out.println(name + ":" + text);
    }
    
    public String get_name() {
        return name;
    }

    public String set_name(String new_name) {
        name = new_name;
        return name;
    }

    public int get_age() {
        return age;
    }

    public int set_age(int new_age) {
        age = new_age;
        return age;
    }
    
    public void repeat_sentence(int x) {
        if(x<1) {
            return;
        }
        System.out.println("Pikseli juoksee kovaa vauhtia!");
        repeat_sentence(x - 1);
    }


}