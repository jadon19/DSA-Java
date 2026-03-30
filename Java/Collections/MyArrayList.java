package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// ordered collection of elements
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        // to add an element
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        //override the add method in arraylist class
        cars.add(0,"some elements");
        System.out.println(cars);


        //to get element by index, use get method
        System.out.println(cars.get(0));

        //change using set method   
        cars.set(2,"changed");

        //remove element by an object and index
        cars.remove("Ford");
        cars.remove(1);
        System.out.println(cars);

        //use clear method to remove all the elements
        //cars.clear();

        for(int i =0;i<cars.size();i++){
            System.err.println(cars.get(i));
        }

        Collections.sort(cars);
        // A utility class "Collections" containing static methods 
        // for operating on objects of the Collection interface 
        // to implement algorithms such as sorting or searching.
        System.out.println(cars);
        

        // Implement datatypes as wrapper class
        List<Integer> num = new ArrayList<Integer>();
        num.add(45);
        System.out.println(num);
    }
}
