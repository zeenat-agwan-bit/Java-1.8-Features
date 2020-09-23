package basic;

import java.util.*;
import java.util.stream.*;

public class FilterMethod {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(6);
        System.out.println("Before :" + l);
        //filter(predicate) return type: boolean
        //collect() : collect the things to list of Integer
        List<Integer> l2 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
         System.out.println(l2);

    }
}
