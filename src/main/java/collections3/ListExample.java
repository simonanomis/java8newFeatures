package collections3;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class ListExample {

    public static void main(String[] args) {

        //java 7
        List<String> l = new ArrayList<>();
        l.add("Simona");
        l.add("Filip");
        l.add("Simona");
        System.out.println(l);

        //java 7
        Deque<String> l1 = new LinkedList<>();
        List<String> l2 = new LinkedList<>();
        l1.add("Simona");
        l1.add("Filip");
        l1.add("Simona");
        System.out.println(l1);

        Function<Integer, String> intToString = Object::toString;
        Function<String, String> quote = s -> "'" + s + "'";
        Function<Integer, String> quoteIntToString = quote.compose(intToString);
        System.out.println(quoteIntToString.apply(5));

    }

}
