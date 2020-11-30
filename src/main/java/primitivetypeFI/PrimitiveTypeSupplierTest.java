package primitivetypeFI;

import java.util.function.IntSupplier;

public class PrimitiveTypeSupplierTest {
    public static void main(String[] args) {
        //generate random 6 numbered otp
        IntSupplier intSupplier = () -> (int) (Math.random() * 10);
        String otp = "";
        for(int i = 0; i<6; i++) {
            otp = otp + intSupplier.getAsInt();
        }
        System.out.println(otp);

        //LongSupplier
        //DoubleSupplier
        //BooleanSupplier
    }
}
