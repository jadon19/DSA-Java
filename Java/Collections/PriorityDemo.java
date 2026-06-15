package Collections;
import java.util.*;
class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1,Integer o2){
        if(o1<o2) return 1;
        if(o1>o2)return -1;
        return 0;
    }

}
public class PriorityDemo{
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new MyComparator());
        queue.add(10);
        queue.add(15);
        queue.add(5);
        queue.add(20);
        queue.add(2);
        System.out.println(queue);
    }
}