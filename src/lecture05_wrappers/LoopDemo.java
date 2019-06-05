package lecture05_wrappers;

import lecture04.constructors.test.A;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Class LoopDemo
 *
 * Created by yslabko on 12/04/2017.
 */
public class LoopDemo {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        A a = new A(1);
        Class<? extends A> clazz = a.getClass();
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getName());
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName());
            method.setAccessible(true);
            method.invoke(a);
        }

        Long l1 = 25L;
        Long l2 = 25L;
        https://tut.by
        System.out.println("get response from tut.by");
    }
}
