public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Bradley", 5, "Hey");
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println(animal.getWeight());
    }
}

class Animal <T> {
    private String name;
    private int age;
    private T weight; // generic type - to account for floats, doubles, etc.

    public Animal(String name, int age, T weight) {
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