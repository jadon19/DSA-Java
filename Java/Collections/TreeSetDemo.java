package Collections;

import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.addAll(List.of(23,23,44,5,6,77,8,9,10));
        System.out.println(ts);
    }
}
