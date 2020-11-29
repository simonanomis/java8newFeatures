package primitivetypeFI;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitveTypeFunctionTest {
    public static void main(String[] args) {
        IntFunction<Integer> function = i-> i*i; //only one time conversion
        System.out.println(function.apply(5));


        ToIntFunction<String> function1 = s -> s.length();
        System.out.println(function1.applyAsInt("value"));

        IntToDoubleFunction function2 = i-> Math.sqrt(i);
        System.out.println(function2.applyAsDouble(5));
    }
}
