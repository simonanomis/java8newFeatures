package supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Date> dateSupplier = () -> new Date();
        System.out.println(dateSupplier.get());

        //get random name
        Supplier<String> nameSupplier = () -> {
          String[] names = {"Simona", "Marija", "Kika", "Ina"};
          int number = (int) (Math.random() * 4); // 0<=x<1 max=0.9999; random from 0 to 3
            return names[number];
        };
        System.out.println(nameSupplier.get());

        //get 6-digit OTP-one time password

        Supplier<String> passwordSupplier = () -> {
            String otp = "";
            for (int i = 0; i<=6; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(passwordSupplier.get());

        //get random password where
        //length should be 8 chars
        //2, 4, 6, 8 are digits
        //1, 3, 5, 7 are alphabet uppercase symbols + allowed @, #, $
        Supplier<Integer> digitsSupplier = () ->
            Math.toIntExact(Math.round(Math.random() * 8));
        ;

        String symbols = "ABCDEFGHIGKLMNOPQRSTUVWXYZ@#$";
        Supplier<Character> symbolsSupplier = () ->
             symbols.charAt(Math.toIntExact(Math.round(Math.random() * 29)));

        Supplier<String> stringSupplier = () -> {
            String password = "";
            for (int i = 1; i<=8; i++) {
                if(i%2 == 0) {
                    password = password + digitsSupplier.get();
                } else {
                    password = password + symbolsSupplier.get();
                }
            }
            return password;
        };
        System.out.println(stringSupplier.get());;
    }
}
