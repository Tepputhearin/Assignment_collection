package Collections;

import java.util.List;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args){
    List<Integer> vect = new Vector<>();
    for(int i=1; i<21; i++){
            vect.add(i);
        }
        System.out.println(vect);
    Vector<Integer> v = new Vector<Integer>(20);
    for (int j=1; j<=19; j++){
        v.add(j);
    }
        System.out.println(v);
    }
}
