package predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        //Predicate simple

        //test if some number is grater than 10
       Predicate<Integer> predicate = i -> i > 10;
       System.out.println(predicate.test(2));

       //test if length of a string is greater of 5
        Predicate<String> predicate1 = word -> word.length() > 5;
        System.out.println(predicate1.test("Simona"));
        System.out.println(predicate1.test("abc"));

        //test if collection is empty
        Predicate<Collection> p =  collection -> collection.isEmpty();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(p.test(list));

        //Predicate joining

        //check if given number is greater then 10 and if is a even number
        int[] x = {0, 5, 10, 15, 20, 25, 30};
        Predicate<Integer> p1 = integer -> integer>10;
        Predicate<Integer> p2 = integer -> integer%2==0;
        System.out.println("The numbers are greater then 10: ");
        testPredicate(p1, x);
        System.out.println("The numbers are even: ");
        testPredicate(p2, x);
        System.out.println("The numbers are not greater then 10: ");
        testPredicate(p1.negate(), x);
        System.out.println("The numbers are greater then 10 and even numbers: ");
        testPredicate(p1.and(p2), x);
        System.out.println("The numbers are greater then 10 OR even numbers: ");
        testPredicate(p1.or(p2), x);
    }

    public static void testPredicate(Predicate<Integer> predicate, int[] x) {
        for(int number: x) {
            if(predicate.test(number)) {
                System.out.println(number);
            }
        }
    }



    public boolean test(Integer integer) {
        if (integer > 10)
            return true;
        else return false;
    }
}
