package exercise7;

public class Dog implements Domestic {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Dog’s name is " + this.name);
    }
}
