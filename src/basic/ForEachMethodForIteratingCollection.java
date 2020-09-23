package basic;
import java.util.*; //package level
import java.util.ArrayList;
import java.util.function.*; //subpackage level

public class ForEachMethodForIteratingCollection {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(6);
        System.out.println("Before :" + l);
        /* Consumer<Integer> c = i -> {
            System.out.println("The Square of " + i + " is : " + (i * i));
        };
         */

        l.stream().forEach(i -> {
            System.out.println("The Square of " + i + " is : " + (i * i));
        });

        //To iterate collection elements
        //l.stream().forEach(System.out ::println); //it will print
    }
}
