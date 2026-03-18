package OOPS.Inheritance.Overriding;
class Parent {

    void display() {
        System.out.println("Parent display()");
    }

    void parentMethod() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {

    @Override
    void display() {
        System.out.println("Child display()");
    }

    void childMethod() {
        System.out.println("Child method");
    }
}

public class Test {
    public static void main(String[] args) {

        Parent p1 = new Parent();
        Parent p2 = new Child();
        Child  c1 = new Child();

        // A
        p1.display();

        // B
        p2.display();

        // C
        c1.display();

        // D
        Parent p3 = (Parent) new Child();
        p3.display();

        // E
        Child c2 = (Child) p2;
        c2.childMethod();

        // F
        Child c3 = (Child) p1;
        c3.display();

        // G
        ((Child)p2).childMethod();

        // H
        ((Parent)c1).display();
    }
}