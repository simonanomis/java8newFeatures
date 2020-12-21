package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(15);
        list.add(25);
        System.out.println(list);

        //Filter even numbers in another collection

        //till 1.8
        List<Integer> newList = new ArrayList<>();
        for(Integer number: list) {
            if(number%2 == 0) {
                newList.add(number);
            }
        }
        System.out.println(newList);

        //from 1.8 with Streams
        List<Integer> streamsList = list
                .stream()
                .filter(number -> number%2==0)
                .collect(Collectors.toList());
        System.out.println(streamsList);

        //Create new coll with double values
        List<Integer> newList1 = new ArrayList<>();
        for(Integer number: list) {
            newList1.add(number*2);
        }
        System.out.println(newList1);

        List<Integer> streamsList1 = list
                .stream()
                .map(number -> number*2)
                .collect(Collectors.toList());
        System.out.println(streamsList1);
    }
}
