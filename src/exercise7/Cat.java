package exercise7;

public class Cat implements Domestic {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Cat’s name is " + this.name);
    }
}
