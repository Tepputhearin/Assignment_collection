package Collections;

import java.util.LinkedHashSet;

public class LinkedHashsets {
    public static void main(String[] args){
        LinkedHashSet<String> l = new LinkedHashSet<String>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.remove("A");
        System.out.println(l);
    }
}
