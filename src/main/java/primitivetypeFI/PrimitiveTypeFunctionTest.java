package primitivetypeFI;

import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class PrimitiveTypeFunctionTest {
    public static void main(String[] args) {
        IntFunction<Integer> function = i-> i*i; //only one time conversion
        System.out.println(function.apply(5));

        LongFunction<Double> ob = a -> a / 2.0;
        System.out.println(ob.apply(3));

        DoubleFunction<Integer> doubleFunction = a -> (int)(a * 10);
        System.out.println(doubleFunction.apply(5.4));

        ToIntFunction<String> function1 = s -> s.length();
        System.out.println(function1.applyAsInt("value"));

        ToLongFunction<Integer> toLongFunction = a -> a * 10000;
        System.out.println(toLongFunction.applyAsLong(3));

        ToDoubleFunction<Integer> toDoubleFunction = a -> a / 2;
        System.out.println(toDoubleFunction.applyAsDouble(3));

        IntToDoubleFunction function2 = i-> Math.sqrt(i);
        System.out.println(function2.applyAsDouble(5));

        IntToLongFunction func = a -> 1000000 * a;
        System.out.println(func.applyAsLong(2));

        LongToIntFunction longToIntFunction = a -> (int)a * 100000;
        System.out.println(longToIntFunction.applyAsInt(2));

    }
}
