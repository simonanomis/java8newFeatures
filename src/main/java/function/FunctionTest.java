package function;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> test = someString ->someString.length();
        System.out.println(test.apply("problems in project"));
        Function<String, String> removeEmptySpaces = testString -> testString.replaceAll(" ", "");
        System.out.println(removeEmptySpaces.apply("problems in project"));
        Function<Integer, Integer> testSquare = someNumber -> someNumber*someNumber;
        System.out.println(testSquare.apply(5));
        Function<String, Integer> countSpaces = testString -> testString.length() -testString.replaceAll(" ", "").length();
        System.out.println(countSpaces.apply("Build completed successfully in 1 s 337 ms"));
    }
}
