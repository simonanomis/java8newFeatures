package predicate;

import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {
        //test if some number is grater than 10
       Predicate<Integer> predicate = i -> i > 10;
       System.out.println(predicate.test(2));

       //test if length of a string is greater of 5
        Predicate<String> predicate1 = word -> word.length() > 5;
        System.out.println(predicate1.test("Simona"));
    }




    public boolean test(Integer integer) {
        if (integer > 10)
            return true;
        else return false;
    }
}
