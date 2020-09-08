package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class RemoveNullEmptyPredicate {

    public static void main(String[] args) {
        String[] names = {"Simona", "Ana", "", null, "Andrej"};
        Predicate<String> removeNullEmpty = name -> name != null && name.length() != 0;
        ArrayList<String> listofnames = testPredicate(removeNullEmpty, names);

        System.out.println("Names that are not null and empty : " + Arrays.toString(listofnames.toArray()));
    }

    public static ArrayList<String> testPredicate(Predicate<String> startsWithK, String[] names) {
        ArrayList<String> listofnames = new ArrayList<>();
        for(String name: names) {
            if(startsWithK.test(name)) {
                listofnames.add(name);
            }
        }
        return listofnames;
    }
}
