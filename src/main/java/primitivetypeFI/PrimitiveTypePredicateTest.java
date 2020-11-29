package primitivetypeFI;


import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class IntPredicateTest {
    public static void main(String[] args) {
        int[] x = {0, 5, 10, 15, 20, 25, 30};
        //IntPredicate
        IntPredicate p1 = integer -> integer>10;
        IntPredicate p2 = integer -> integer%2==0;
        System.out.println("The numbers are greater then 10: ");
        testIntPredicate(p1, x);
        System.out.println("The numbers are even: ");
        testIntPredicate(p2, x);

        //LongPredicate
        long[] list = {4, 45, 50, 53};
        LongPredicate l1 = l -> l>10;
        LongPredicate l2 = l -> l%2==0;
        System.out.println("The numbers are greater then 10: ");
        testLongPredicate(l1, list);
        System.out.println("The numbers are even: ");
        testLongPredicate(l2, list);

    }

    public static void testIntPredicate(IntPredicate predicate, int[] x) {
        for(int number: x) {
            if(predicate.test(number)) {
                System.out.println(number);
            }
        }
    }

    public static void testLongPredicate(LongPredicate predicate, long[] x) {
        for(long number: x) {
            if(predicate.test(number)) {
                System.out.println(number);
            }
        }
    }
}
