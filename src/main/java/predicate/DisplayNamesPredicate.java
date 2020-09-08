package predicate;

import java.util.function.Predicate;

public class DisplayNamesPredicate {

    public static void main(String[] args) {
        String[] names = {"Simona", "Filip", "Katerina", "Kristina"};
        Predicate<String> startsWithK = name-> name.charAt(0) == 'K';
        System.out.println("The names starts with letter K are: ");
        testPredicate(startsWithK, names);
    }

    public static void testPredicate(Predicate<String> startsWithK, String[] names) {
        for(String name: names) {
            if(startsWithK.test(name)) {
                System.out.println(name);
            }
        }
    }
}
