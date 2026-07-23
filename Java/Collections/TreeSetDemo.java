package Collections;

import java.util.List;
import java.util.TreeSet;
class Pair implements Comparable{
    int x;
    int y;
    public Pair(int x , int y){
        this.x=x;
        this.y = y;
    }
    public String toString(){
        return "x: "+x+"y: "+y;
    }
    @Override
    public int compareTo(Object o){
        Pair p = (Pair)o;
        if(this.x<p.x) return -1;
        else if(this.x>p.x) return 1;
        else {
            if(this.y<p.y) return -1;
            else if(this.y>p.y) return 1;
            else return 0;
        }

    }
}

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.addAll(List.of(23,23,44,5,6,77,8,9,10));
        System.out.println(ts);
        TreeSet<Pair> pairTreeSet = new TreeSet<>();
        pairTreeSet.add(new Pair(34, 4));
        pairTreeSet.add(new Pair(10, 4));
        System.out.println(pairTreeSet);

    }
}
