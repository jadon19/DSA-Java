package OOPS.Inheritance.Overriding;

/*
ABSTRACT CLASS REVISION FILE
Key ideas covered:
1. Abstract class
2. Abstract method
3. Concrete method
4. Constructor in abstract class
5. Method overriding
6. Polymorphism with abstract classes
7. Rules of abstract classes
*/

abstract class Animal {

    // 1. Instance variable
    String name;

    // 2. Constructor (YES abstract classes can have constructors)
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    // 3. Abstract method (no body)
    abstract void sound();

    // 4. Concrete method (has body)
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}


class Dog extends Animal {

    // constructor must call parent constructor
    Dog(String name) {
        super(name);
    }

    // overriding abstract method
    @Override
    void sound() {
        System.out.println(name + " says Bark");
    }
}


class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says Meow");
    }
}


public class AbstractClass {

    public static void main(String[] args) {

        // ❌ Not allowed
        // Animal a = new Animal();

        // ✔ Polymorphism
        Animal a1 = new Dog("Tommy");
        Animal a2 = new Cat("Kitty");

        a1.sound();   // Dog implementation
        a1.sleep();   // Parent method

        a2.sound();   // Cat implementation
        a2.sleep();
    }
}
