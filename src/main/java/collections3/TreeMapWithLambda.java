package collections3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapWithLambda {
    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new TreeMap<>((o1, o2) -> (o1>o2)?-1:(o2 < o1)?1:0);
        integerStringMap.put(100, "Simona");
        integerStringMap.put(50, "Filip");
        integerStringMap.put(240, "Georgina");

        System.out.println(integerStringMap);
    }
}
