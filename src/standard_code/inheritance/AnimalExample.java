package standard_code.inheritance;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.display();
        dog.makeSound();

        Cat cat = new Cat("Whiskers");
        cat.display();
        cat.makeSound();
    }
}
