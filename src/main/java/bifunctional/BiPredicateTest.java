package bifunctional;

import java.util.function.BiPredicate;

public class BiPredicateTest {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> evenPredicate = (a, b) -> (a+b) % 2 == 0;
        System.out.println(evenPredicate.test(10, 20));
        System.out.println(evenPredicate.test(15, 20));
    }
}
