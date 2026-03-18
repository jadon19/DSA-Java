package OOPS.Interface;

// Demonstrates most interface concepts asked in interviews

// 1. Basic Interface
interface Animal {

    // abstract method (implicitly public abstract)
    void makeSound();

    // constant (public static final automatically)
    int LEGS = 4;

    // default method (Java 8)
    default void sleep() {
        log("Animal sleeping");
    }

    // static method (Java 8)
    static void category() {
        System.out.println("Animals are living beings");
    }

    // private helper method (Java 9)
    private void log(String msg) {
        System.out.println("[LOG] " + msg);
    }
}

// 2. Another Interface
interface Pet {
    void play();
}

// 3. Interface Inheritance
interface SmartPet extends Pet {
    void followOwner();
}

// 4. Abstract Class
abstract class LivingBeing {

    int age;

    LivingBeing(int age) {
        this.age = age;
    }

    abstract void breathe();

    void showAge() {
        System.out.println("Age: " + age);
    }
}

// 5. Class implementing multiple interfaces
class Dog extends LivingBeing implements Animal, SmartPet {

    Dog(int age) {
        super(age);
    }

    // must implement abstract methods
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void play() {
        System.out.println("Dog is playing");
    }

    public void followOwner() {
        System.out.println("Dog follows owner");
    }

    void breathe() {
        System.out.println("Dog breathing");
    }
}

// 6. Functional Interface
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

// 7. Main class
public class InterfaceRevision {

    public static void main(String[] args) {

        // Interface reference (polymorphism)
        Animal a = new Dog(5);

        a.makeSound();
        a.sleep();

        // Access constant
        System.out.println("Legs: " + Animal.LEGS);

        // Static method call
        Animal.category();

        System.out.println("-----------");

        Dog d = new Dog(3);
        d.play();
        d.followOwner();
        d.breathe();
        d.showAge();

        System.out.println("-----------");

        // Functional interface with lambda
        Calculator add = (x, y) -> x + y;

        System.out.println("Sum = " + add.operate(10, 20));
    }
}
