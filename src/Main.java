import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] weight = {1, 2, 3, 4, 5};
        int[] age = {5, 4, 3, 2, 1};
        String[] name = {"a", "b", "c", "d", "e"};
        ArrayList<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            animals.add(new Animal(weight[i], age[i], name[i]));
        }

        Comparator<Animal> comparator1 = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                if (o1.weight > o2.weight) {
                    return 1;
                } else if (o1.weight < o2.weight) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Comparator<Animal> comparator2 = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                if (o1.age > o2.age) {
                    return 1;
                } else if (o1.age < o2.age) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to sort by weight, 2 to sort by age");
        int choice = scanner.nextInt();
        if (choice == 1) {
            Collections.sort(animals, comparator1);
        } else if (choice == 2) {
            Collections.sort(animals, comparator2);
        } else {
            System.out.println("Wrong choice");
        }

        for (Animal animal : animals) {
            System.out.println(animal.weight + " " + animal.age + " " + animal.name);
        }
    }
}

class Animal {
    int age;
    String name;
    int weight;

    public Animal(int weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }
}