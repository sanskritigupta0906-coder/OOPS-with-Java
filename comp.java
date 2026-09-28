//create a program for storing marks of a student in an arrayList. Sort the arrayList in ascending order and display the result
//sort the arrayList in descending order and display all the marks

import java.util.*;

interface Comparable{

    void sort();
}

public class comp {

    public static void main(String[] args) {
        List<Integer>li=new ArrayList<>();

        li.add(78);
        li.add(98);
        li.add(86);
        li.add(69);
        li.add(100);

        li.sort(null);
        System.out.println(li);

        li.sort(Comparator.reverseOrder());
        System.out.println(li);

        

    }
    
}
