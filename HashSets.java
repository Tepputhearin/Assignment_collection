package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args){
        HashSet<Integer> h = new HashSet<Integer>();
        h.add(1);
        h.add(2);
        h.add(5);
        h.add(6);
        h.remove(5);
        Iterator<Integer> it = h.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(h);
        System.out.println(h.isEmpty());
    }
}
