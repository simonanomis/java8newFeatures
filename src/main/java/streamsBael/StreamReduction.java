package streamsBael;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduction {
    public static void main(String[] args) {

        OptionalInt reduced =
                IntStream.range(1, 4).reduce((a, b) -> a + b);

        int reducedTwoParams =
                IntStream.range(1, 4).reduce(10, (a, b) -> a + b);

        int reducedParams = Stream.of(1, 2, 3)
                .reduce(10, (a, b) -> a + b, (a, b) -> {
                    System.out.println("combiner was called");
                    return a + b;
                });

        int reducedParallel = Arrays.asList(1, 2, 3).parallelStream()
                .reduce(10, (a, b) -> a + b, (a, b) -> {
                    System.out.println("combiner was called");
                    return a + b;
                });

        List<Product> productList = Arrays.asList(new Product(23, "potatoes", 23),
                new Product(14, "orange", 14), new Product(13, "lemon", 13),
                new Product(23, "bread", 23), new Product(13, "sugar", 13));

        //Converting a stream to the Collection
        List<String> collectorCollection =
                productList.stream().map(Product::getName).collect(Collectors.toList());

        //Reducing to String:

        String listToString = productList.stream().map(Product::getName)
                .collect(Collectors.joining(", ", "[", "]"));

        //Processing the average value of all numeric elements of the stream
        double averagePrice = productList.stream()
                .collect(Collectors.averagingInt(Product::getPrice));

        //Processing the sum of all numeric elements of the stream
        int summingPrice = productList.stream()
                .collect(Collectors.summingInt(Product::getPrice));

        //Collecting statistical information about stream’s elements
        IntSummaryStatistics statistics = productList.stream()
                .collect(Collectors.summarizingInt(Product::getPrice));
        System.out.println(statistics.getSum());

        //Grouping of stream’s elements according to the specified function
        Map<Integer, List<Product>> collectorMapOfLists = productList.stream()
                .collect(Collectors.groupingBy(Product::getPrice));

        //Dividing stream’s elements into groups according to some predicate
        Map<Boolean, List<Product>> mapPartioned = productList.stream()
                .collect(Collectors.partitioningBy(element -> element.getPrice() > 15));

        //Pushing the collector to perform additional transformation
        Set<Product> unmodifiableSet = productList.stream()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        Collections::unmodifiableSet));
    }
}
