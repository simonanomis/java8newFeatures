package streamsBael;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) throws IOException {

        //Empty Stream
        Stream<String> streamEmpty = Stream.empty();
        Collection<String> collection = Arrays.asList("a", "b", "c");

        //Stream of Collection
        Stream<String> streamOfCollection = collection.stream();

        //Stream of Array
        Stream<String> streamOfArray = Stream.of("a", "b", "c");
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

        //Stream.builder()
        Stream<String> streamBuilder =
                Stream.<String>builder().add("a").add("b").add("c").build();

        //Stream.generate()
        //create a sequence of ten strings with the value – “element”.
        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(10);

        //Stream.iterate()
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);

        //Stream of Primitives
        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);

        //create a DoubleStream, which has three elements
        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);

        // Stream of String
        IntStream streamOfChars = "abc".chars();

        //breaks a String into sub-strings according to specified RegEx
        Stream<String> streamOfString =
                Pattern.compile(", ").splitAsStream("a, b, c");

        //Stream of File
        Path path = Paths.get("C:\\file.txt");
        Stream<String> streamOfStrings = Files.lines(path);
        Stream<String> streamWithCharset =
                Files.lines(path, Charset.forName("UTF-8"));

    }
}
