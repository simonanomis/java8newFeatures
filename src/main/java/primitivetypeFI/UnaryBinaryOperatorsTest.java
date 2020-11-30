package primitivetypeFI;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperatorsTest {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = integer -> integer*integer;
        unaryOperator.apply(9);

        IntUnaryOperator intUnaryOperator = i->i*i;
        intUnaryOperator.applyAsInt(4);

        //LongUnaryOperator
        //DoubleUnaryOperator

        BinaryOperator<String> binaryOperator = (word,word2)->word+word2;
        System.out.println(binaryOperator.apply("hey ", "you!"));

        IntBinaryOperator intBinaryOperator = (x,y) -> x*y+4;
        System.out.println(intBinaryOperator.applyAsInt(7, 6));

        //DoubleBinaryOperator
        //LongBinaryOperator
    }
}
