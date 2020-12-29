package streamsBael;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReferenceStream {

    private static int counter;

    private static void wasCalled() {
        counter++;
    }
    public static void main(String[] args) {

        List<String> elements =
                Stream.of("a", "b", "c").filter(element -> element.contains("b"))
                        .collect(Collectors.toList());
        Optional<String> anyElement = elements.stream().findAny();
        Optional<String> firstElement = elements.stream().findFirst();

        //Stream Pipeline
        Stream<String> onceModifiedStream =
                Stream.of("abcd", "bbcd", "cbcd").skip(1);
        Stream<String> twiceModifiedStream =
                Stream.of("abcd", "bbcd", "cbcd").skip(1)
                        .map(element -> element.substring(0, 3));

        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
        long size = list.stream().skip(1)
                .map(element -> element.substring(0, 3)).sorted().count();


        List<String> list2 = Arrays.asList("abc1", "abc2", "abc3");
        counter = 0;
        Stream<String> stream = list2.stream().filter(element -> {
            wasCalled();
            return element.contains("2");
        });

        Optional<String> stream1 = list.stream().filter(element -> {
            System.out.println("filter() was called");
            return element.contains("2");
        }).map(element -> {
            System.out.println("map() was called");
            return element.toUpperCase();
        }).findFirst();

        long size1 = list.stream().skip(2).map(element -> {
            wasCalled();
            return element.substring(0, 3);
        }).count();
    }
}
