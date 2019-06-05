package lecture08_generics_annotations.generic;

import java.util.Date;

/**
 * Class GenericBox
 *
 * Created by yslabko on 05/23/2018.
 */
public class GenericBox <T> {
    private T item;

    public GenericBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public <Type extends Number> Type getInfo(Type t) {
        System.out.println("item is a method parameter = " + t + " as Byte:" + t.byteValue());
        return t;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void info() {
        String text = "Not Integer";
        if (item instanceof Integer) {
            text = "Integer";
        }
        System.out.println(text);
    }

    public int getHash(GenericBox<?> box) {
        return box.hashCode();
    }
}