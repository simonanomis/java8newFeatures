package collections3;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWitnLambda {

    public static void main(String[] args) {
      /*  Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(10);
        integerSet.add(12);
        integerSet.add(5);
        integerSet.add(3);
        integerSet.add(11);
        integerSet.add(1);
        System.out.println(integerSet);*/

        Set<Integer> integerSetComparator = new TreeSet<>((o1, o2) -> (o1 > o2) ? -1 : (o2 < o1) ? 1 : 0);
        integerSetComparator.add(10);
        integerSetComparator.add(0);
        integerSetComparator.add(15);
        integerSetComparator.add(25);
        integerSetComparator.add(5);
        integerSetComparator.add(20);
        System.out.println(integerSetComparator);
    }
}
