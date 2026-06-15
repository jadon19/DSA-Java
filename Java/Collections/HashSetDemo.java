package Collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10);
        System.out.println(hashSet);
        Object[] arr = hashSet.toArray();
        for (Object object : arr) {
            System.out.println(object);
        }
        System.out.println(arr);
        
    }
}
