package exercise7;

public class Animals {
    public static void main(String[] args) {
        Cat cat = new Cat("Boris");
        Dog dog = new Dog("Love");
        Fox fox = new Fox("Arctic Fox");

        cat.printName();
        dog.printName();
        fox.printSpecies();
    }
}
