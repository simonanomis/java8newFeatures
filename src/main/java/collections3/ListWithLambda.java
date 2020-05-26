package collections3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListWithLambda {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(15);
        integerList.add(3);
        integerList.add(20);
        System.out.println("Before sorting the list is: "+ integerList);

        Collections.sort(integerList); //sorted with default natural sorting order ascending
        System.out.println("After sorting the list is: "+ integerList);

        //sorting with descending order with lambda, we do not need MyComparator class
        Collections.sort(integerList, (o1, o2) -> (o1 > o2) ? -1 : (o2 < o1) ? 1 : 0);
        System.out.println("After sorting the descending list is: "+ integerList);
    }
}
