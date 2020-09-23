package basic;

import java.util.*;
import java.util.stream.Stream;

public class ToArrayMethod {
//to convert Stream of objects into Array

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(6);
         System.out.println("Before :" + l);
        
        Integer[] i = l.stream().toArray(Integer[]::new); //constructor reference which always returns a new object
    Stream.of(i).forEach(System.out::println); //where Stream.of(i) converts Integer[] into a Stream because forEach() is applicable for streams only.
    
    }
}
