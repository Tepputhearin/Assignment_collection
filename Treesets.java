package Collections;

import java.util.Set;
import java.util.TreeSet;

public class Treesets {
    public static void main(String[] args){
        Set<String> t = new TreeSet<>();
        t.add("Noob");
        t.add("Bob");
        t.add("Thearin");
        t.add("James");
        t.add("Sohn");
        t.remove("Noob");
        System.out.println(t.contains("Noob2"));
        System.out.println(t);
    }
}
