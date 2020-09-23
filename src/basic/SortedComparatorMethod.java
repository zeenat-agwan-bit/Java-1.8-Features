package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedComparatorMethod {
public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(45);
        marks.add(60);
        marks.add(33);
        marks.add(30);
        marks.add(80);
        marks.add(90);
        System.out.println("Before :" + marks);
        
        
        List<Integer> sortedList= marks.stream().sorted((i1,i2) -> (i1<i2)?1:((i1>i2)?-1 :0)).collect(Collectors.toList());
        System.out.println(sortedList);

    }    
}
