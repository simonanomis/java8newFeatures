package streams;

import java.util.ArrayList;

public class StreamTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(15);
        list.add(1);

        Integer minValue = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(minValue);
        Integer maxValue = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(maxValue);


        list.stream().forEach(System.out::println);

        Integer[] intArray = list.stream().toArray(Integer[]::new);
        for(Integer num: intArray) {
            System.out.println(num);
        }
    }
}
