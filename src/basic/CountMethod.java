package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountMethod {
     public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(45);
        marks.add(60);
        marks.add(33);
        marks.add(30);
        marks.add(80);
        marks.add(90);
        System.out.println("Before :" + marks);
        
        //for every object if you want to perform some operations then go for map()
        //map(function)  :for business logic(to do some operation)
        //count() : 
        
        long  noOfFailedStd = marks.stream().filter(m->m<35).count();
        System.out.println(noOfFailedStd);

    }
}
