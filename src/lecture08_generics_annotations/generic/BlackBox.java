package lecture08_generics_annotations.generic;

/**
 * Class BlackBox
 *
 * Created by yslabko on 05/23/2018.
 */
public class BlackBox {
    private Object item;

    public BlackBox(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
