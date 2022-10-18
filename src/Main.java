import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] weight = {1, 2, 3, 4, 5, 10};
        int[] age = {5, 4, 3, 2, 1, 10};
        String[] name = {"a", "b", "c", "d", "e", "f"};
        ArrayList<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            animals.add(new Animal(weight[i], age[i], name[i]));
        }

        Iterable<Animal> iterable = animals;

        for (Animal animal : iterable) {
            System.out.println(animal.name);
        }

        Iterator<Animal> iterator = iterable.iterator();

        int SUM_OF_WEIGHT = 0;

        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            SUM_OF_WEIGHT += animal.getWeight();
        }

        double average = (double) SUM_OF_WEIGHT / animals.size();
        System.out.println(average);
    }

    static class Animal {
        int age;
        String name;
        int weight;

        public Animal(int weight, int age, String name) {
            this.weight = weight;
            this.age = age;
            this.name = name;
        }

        public int getWeight() {
            return weight;
        }
    }
}