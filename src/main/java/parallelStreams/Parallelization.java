package parallelStreams;

import streamsBael.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Parallelization {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(new Product(23, "potatoes", 23),
                new Product(14, "orange", 14), new Product(13, "lemon", 13),
                new Product(23, "bread", 23), new Product(13, "sugar", 13));


        Stream<Product> streamOfCollection = productList.parallelStream();
        boolean isParallel = streamOfCollection.isParallel();
        boolean bigPrice = streamOfCollection
                .map(product -> product.getPrice() * 12)
                .anyMatch(price -> price > 200);
        System.out.println(isParallel + " and bigPrice: " + bigPrice);

        IntStream intStreamParallel = IntStream.range(1, 150);
        boolean isParallel2 = intStreamParallel.isParallel();
        System.out.println(isParallel2);

        //The stream in parallel mode can be converted back to the sequential mode
        IntStream intStreamSequential = intStreamParallel.sequential();
        boolean isParallel3 = intStreamSequential.isParallel();
        System.out.println(isParallel3);
    }
}
