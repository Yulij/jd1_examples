package lecture10.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Class HashMapDemo
 *
 * Created by yslabko on 12/15/2017.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        System.out.println();
        Map<Integer, String> words = new HashMap<>();
        words.put(2, "Two");
        words.put(3, "Three");
        words.put(1, "One");

        for (Integer key : words.keySet()) {
            System.out.println("{" + key + ":" + words.get(key) + "}");
        }
    }
}
