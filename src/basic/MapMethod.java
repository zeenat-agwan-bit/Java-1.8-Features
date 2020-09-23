package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(0);
        marks.add(1);
        marks.add(2);
        marks.add(3);
        marks.add(4);
        marks.add(6);
        System.out.println("Before :" + marks);
        
        //for every object if you want to perform some operations then go for map()
        //map(function)  :for business logic(to do some operation)
        //collect() : collect the things to list
        
        List<Integer> updatedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
        System.out.println(updatedMarks);

    }
}
