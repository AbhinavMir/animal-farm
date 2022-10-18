import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] weight = {1, 2, 3, 4, 5};
        int[] height = {5, 4, 3, 2, 1};
        String[] name = {"a", "b", "c", "d", "e"};
        ArrayList<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            animals.add(new Animal(weight[i], height[i], name[i]));
        }

        Collections.sort(animals);
        for (Animal animal : animals) {
            System.out.println(animal.weight + " " + animal.age + " " + animal.name);
        }
    }
}

class Animal implements Comparable<Animal> {
    int age;
    String name;
    int weight;

    public Animal(int weight, int height, String name) {
        this.weight = weight;
        this.age = height;
        this.name = name;
    }

    @Override
    public int compareTo(Animal o) {
        if (o.age > this.age) return -1;
        else if (o.age < this.age) return 1;
        else return 0;
    }
}