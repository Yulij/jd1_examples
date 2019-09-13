package lecture19_synhro_elements.semaphore;

import java.util.concurrent.Semaphore;

/**
 * Created by yslabko on 029 29 2015.
 */
public class Pool<T> {
    //Доступно 3 объекта
    public static final int MAX_AVAILABLE = 3;
    private final Semaphore available = new Semaphore(MAX_AVAILABLE, true);
    protected boolean[] used = new boolean[MAX_AVAILABLE];
    // Структура данных для демонстрации
    protected T[] items = null; //не зависит от типов управляемых элементов

    private Pool(T[] items) {
        this.items = items;
    }

    public static <T> Pool<T> build(T[] pool) {
        return new Pool<>(pool);
    }

    public T getItem() throws InterruptedException {
        available.acquire();
        return getNextAvailableItem();
    }

    //Взять неиспользуемое данное
    protected synchronized T getNextAvailableItem() {
        for (int i = 0; i < MAX_AVAILABLE; ++i) {
            if (!used[i]) {
                used[i] = true;
                return items[i];
            }
        }
        return null; // никогда не должен достич (в теории)
    }

    //Поместить данное
    public void putItem(T x) {
        if (markAsUnused(x))
            available.release();
    }

    protected synchronized boolean markAsUnused(T item) {
        for (int i = 0; i < MAX_AVAILABLE; ++i) {
            if (item == items[i]) {
                if (used[i]) {
                    used[i] = false;
                    return true;
                } else
                    return false;
            }
        }
        return false;
    }
}
