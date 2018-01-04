package lecture09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by yslabko on 12/13/2017.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(){{add("123");add("321");}};
        ListIterator<String> i = list.listIterator();
        while (i.hasNext()) {
            String temp = i.next();
            if ("123".equals(temp)) {
// ConcurrentModificationException
//                list.remove(0);
                i.remove();
            } else {
                temp = i.next();
            }
        }

        ArrayListDemo demo = new ArrayListDemo();
        System.out.println(demo.getStr());
        i.next();

    }

    public String getStr() {
        return "Hi";
    }
}
