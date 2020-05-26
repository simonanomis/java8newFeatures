package collections3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        //java 7 printed without duplicates
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Simona");
        hashSet.add("Filip");
        hashSet.add("Nadica");
        hashSet.add("Georgina");
        hashSet.add("Simona");
        System.out.println(hashSet);
        //java 7 printed without duplicates but with alphabetical order
        Set<String> hashSet1 = new TreeSet<>();
        hashSet1.add("Simona");
        hashSet1.add("Filip");
        hashSet1.add("Nadica");
        hashSet1.add("Georgina");
        hashSet1.add("Simona");
        System.out.println(hashSet1);
    }
}
