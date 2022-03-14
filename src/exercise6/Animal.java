package exercise6;

interface AnimalInterface {
    public void sound();
}

class Cat implements AnimalInterface{
    public void sound() {
        System.out.println("Meow");
    }
}

class Dog implements AnimalInterface{
    public void sound() {
        System.out.println("Bark");
    }
}

class Fox implements AnimalInterface{
    public void sound() {
        System.out.println("Wa-pow");
    }
}

public class Animal {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fox fox = new Fox();

        cat.sound();
        dog.sound();
        fox.sound();
    }
}


