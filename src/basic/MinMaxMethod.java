package basic;

import java.util.ArrayList; 

public class MinMaxMethod {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(6);
        System.out.println("Before :" + l);
        //Ascending Order
        System.out.println("For Ascending:");

        Integer min = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(min);
        Integer max = l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(max);

        //Descending Order
        System.out.println("For Descending:");

        Integer min1 = l.stream().min((i1, i2) -> -i1.compareTo(i2)).get();
        System.out.println(min1);
        Integer max1 = l.stream().max((i1, i2) -> -i1.compareTo(i2)).get();
        System.out.println(max1);

    }
}
