package collections3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {
        //key value pairs without duplicates
        Map<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("P", "Potato");
        map.put("B", "Banana");
        map.put("C", "Carrot");
        map.put("A", "Apple");
        System.out.println(map);

        //key value pairs without duplicates with order
        Map<String, String> mapTree = new TreeMap<>();
        mapTree.put("A", "Apple");
        mapTree.put("P", "Potato");
        mapTree.put("B", "Banana");
        mapTree.put("C", "Carrot");
        mapTree.put("A", "Apple");
        System.out.println(mapTree);
    }


}
