package lecture10_collections.map;

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
        hashMapDemo();
        treeMapDemo();
        linkedHashMapDemo();
    }

    private static void hashMapDemo() {
        Map<Integer, String> words = new HashMap<>();
        words.put(2, "Two");
        words.put(3, "Three");
        words.put(1, "One");

        for (Integer key : words.keySet()) {
            System.out.println("{" + key + ":" + words.get(key) + "}");
        }
    }

    private static void treeMapDemo() {
        Map<Integer, String> words = new TreeMap<>();
        words.put(2, "Two");
        words.put(3, "Three");
        words.put(1, "One");

        for (Integer key : words.keySet()) {
            System.out.println("{" + key + ":" + words.get(key) + "}");
        }
    }

    private static void linkedHashMapDemo() {
        LinkedHashMap<Integer, String> words = new LinkedHashMap<>();
        words.put(2, "Two");
        words.put(3, "Three");
        words.put(1, "One");

        for (Integer key : words.keySet()) {
            System.out.println("{" + key + ":" + words.get(key) + "}");
        }
    }
}
