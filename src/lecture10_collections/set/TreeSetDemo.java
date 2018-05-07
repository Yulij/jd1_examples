package lecture10_collections.set;

import java.util.TreeSet;

/**
 * Class TreeSetDemo
 *
 * Created by yslabko on 12/15/2017.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("two");
        set.add("one");
        set.add("three");

        for (String s : set) {
            System.out.println(s);
        }


    }
}
