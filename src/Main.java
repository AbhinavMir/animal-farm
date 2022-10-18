import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Dog dog = new Dog("Brutus", 5, 15);
            System.out.println(dog.bark());
            System.out.println(dog.getName());
            System.out.println(dog.getAge());
            System.out.println(dog.getWeight());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Animal {
    private String name;
    private int age;
    private int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}
