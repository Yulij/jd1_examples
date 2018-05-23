package lecture08_generics_annotations.generic;

import java.util.ArrayList;

/**
 * Class BoxDemo
 *
 * Created by yslabko on 05/23/2018.
 */
public class BoxDemo {

    public static void main(String[] args) {
//        blackBoxDemo();
        genericBoxDemo();
        Class clazz;
    }

    private static void blackBoxDemo() {
        BlackBox box = new BlackBox("1");
        Object item = box.getItem();
        // seems it was one (1). let's use it in calculation
        System.out.println((int)item + 10);
    }

    private static void genericBoxDemo() {
        GenericBox<Number> box = new GenericBox<>(1.0);
        Integer item = (Integer) box.getItem();
        // seems it was one. let's use it in calculation
//        System.out.println((int)item + 10);
        System.out.println(Integer.valueOf(item) + 10);
        box.info();
        GenericBox<Byte> stringBox = new GenericBox<>((byte)1);
        box.compare(new ArrayList<>());
    }
}
