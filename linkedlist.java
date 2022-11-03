package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args){
        LinkedList<Integer> link = new LinkedList<Integer>();

        link.add(23);
        link.add(22);
        link.add(11);
        link.add(1, 25);

        System.out.println(link);
    }
}
