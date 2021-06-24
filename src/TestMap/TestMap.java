package TestMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hasMap = new HashMap<>();
        hasMap.put("Nam", 22);
        hasMap.put("Hien", 21);
        hasMap.put("Hung", 20);
        hasMap.put("Hoang", 19);
        System.out.println("Cac muc trong HasMap");
        System.out.println(hasMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Cac muc trong TreeMap");
        System.out.println(treeMap);

        Map<String, Integer> linkedHasMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHasMap.put("Nam" , 22);
        linkedHasMap.put("Hien" , 21);
        linkedHasMap.put("Hung" , 20);
        linkedHasMap.put("Hoang" , 19);
        System.out.println("Tuoi cua Nam la : " + linkedHasMap.get("Nam"));

    }

}
