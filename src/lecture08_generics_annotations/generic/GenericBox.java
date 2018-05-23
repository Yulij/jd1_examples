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

    public <T1> void compare(T1 t) {
        t.equals(item);
        Date date = new Date(2018, 5, 23);
    }
}
