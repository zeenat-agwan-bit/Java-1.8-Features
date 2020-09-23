/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ZEENAT AGWAN
 */
public class SortingForStrings {
    public static void main(String[] args) {
        ArrayList<String> marks = new ArrayList<String>();
        marks.add("A");
        marks.add("AA");
        marks.add("AAA");
        marks.add("AAAA");
        marks.add("AAAAA");
        marks.add("AAAAAA");
        System.out.println("Before :" + marks);
        Comparator<String> c=(s1,s2) -> {
        int l1=s1.length();
         int l2=s1.length();
         if(l1<l2) return -1;
          else if(l1>l2) return +1;
          else return s1.compareTo(s2);
        };
        
        List<String> sortedList= marks.stream().sorted(c).collect(Collectors.toList());
        System.out.println(sortedList);

    }    
}
