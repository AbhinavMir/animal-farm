import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Try entering a number on name and a string on age and see what happens!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter animal name: ");
        String name = scanner.next();
        System.out.println("Enter animal weight: (try out all types)");
        int weight = scanner.nextInt();

        try {
            Animal animal = new Animal(name, 12, weight);

            System.out.println(animal.getName());
            System.out.println(animal.getAge());
            System.out.println(animal.getWeight());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Animal<T extends Number, V extends String> {
    private final V name;
    private final int age;
    private final T weight; // generic type - to account for floats, doubles, etc.

    public Animal(V name, int age, T weight) {
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

    public T getWeight() {
        return weight;
    }
}