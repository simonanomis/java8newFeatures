package streamsOut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsWinterBe {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "c1", "c2");

        //get all elements that starts with c, make them uppercase and sort them
        myList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        //get the first element from the list
        myList
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        //OR
        Stream.of("a1", "a2", "a3", "c1", "c2")
                .findFirst()
                .ifPresent(System.out::println);

        //print range of 1 to 5
        IntStream.range(1, 5)
                .forEach(System.out::println);


        //get average from list
        Arrays.stream(new int[] {1, 2, 3, 5})
                .map(n -> 2*n+1)
                .average()
                .ifPresent(System.out::println);

        //get max number of sequence: here is 7
        Stream.of("a1", "a2", "a3", "a4", "a7")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

        //create list of 4 objects with letter and number from range
        IntStream.range(1, 5)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

        //create list of 4 objects with letter and number from double list
        Stream.of(1.0, 2.0, 4.0, 8.0, 16.0)
                .mapToInt(Double::intValue)
                .mapToObj(i-> "b" + i)
                .forEach(System.out::println);

        //filter will print if foreach is present
        //intermediate operations will only be executed when a terminal operation is present
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}
