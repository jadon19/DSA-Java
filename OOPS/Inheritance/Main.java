package OOPS.Inheritance;

class Circle{
    public int radius;
    public double area(){
        return Math.PI*radius*radius;
    }
}

class Cylinder extends Circle{
    public int height;
    public double volume(){
        return area()*height;
    }
    
}


public class Main {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius=5;
        c.height = 10;
        System.out.println(c.area()); 
        System.out.println(c.volume());
    }
}
