package collections3;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
//        if (o1 > o2) {
//            return -1;
//        } else if (o1 < o2) {
//            return 1;
//        } else {
//            return 0;
//        }
//
        //this down is the same as that up
        return (o1 > o2) ? -1 : (o2 < o1) ? 1 : 0;

    }
}
