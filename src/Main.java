import java.util.*;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Skrt<Animal> animals = new Skrt<>();
        animals.add(new Animal(1, "A"));
        animals.add(new Animal(235, "B"));

        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println(animal);
        }
    }

    static class Animal
    {
        int weight;
        String name;

        public String getName()
        {
            return this.name;
        }

        public Animal(int w, String n)
        {
            this.weight = w;
            this.name = n;
        }
    }

    // Custom Linked Skrt class using Generics
    static class Skrt<T> implements Iterable<T> {
        Node<T> head, tail; // Node class with a bunch of methods and variables

        // add new Element at tail of the linked list in O(1)
        public void add(T data) {
            Node<T> node = new Node<>(data, null);
            if (head == null) tail = head = node;
            else {
                tail.setNext(node);
                tail = node;
            }
        }

        // return Head
        public Node<T> getHead() {
            return head; // current Node
        }

        // return Tail
        public Node<T> getTail() {
            return tail;
        }

        // return Iterator instance
        public Iterator<T> iterator() {
            return new ListIterator<T>(this);
        }
    }

    static class ListIterator<T> implements Iterator<T> {
        Node<T> current;

        // initialize pointer to head of the list for iteration
        public ListIterator(Skrt<T> list) {
            current = list.getHead();
        }

        // returns false if next element does not exist
        public boolean hasNext() {
            return current != null;
        }

        // return current data and update pointer
        public T next() {
            T data = current.getData();
            current = current.getNext();
            return data;
        }

        // implement if needed
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    // Constituent Node of Linked Skrt
    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        // Setter getter methods for Data and Next Pointer
        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}