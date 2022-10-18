public class Dog extends Animal {
    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    public String bark() {
        return "Woof!";
    }
}
