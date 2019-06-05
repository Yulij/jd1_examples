package lecture05_wrappers.wrapper;

/**
 * Class WrapperDemo
 *
 * Created by yslabko on 05/14/2018.
 */
public class WrapperDemo {
    public static void main(String[] args) {
        int i = 127;
        Integer oa = i; //создание объекта+упаковка
        Integer ob = i;
        System.out.println("oa==i " + (oa == i));// true
        System.out.println("ob==i " + (ob == i));// true
        System.out.println("oa==ob " + (oa == ob));// false(ссылки разные)
        System.out.println("equals ->" + oa.equals(i)
                + ob.equals(i)
                + oa.equals(ob));// true

        Number [] nums = {10, 10.5f, 10L};
        Long l = (long)nums[1];
        System.out.println(l);
        numberDemo();
    }

    private static void numberDemo() {
        Float f = new Float(10.01); //double в Float
        String s1 = Float.toString(0f); //float в String
        String s2 = String.valueOf(f); //Float в String
        Byte b = Byte.valueOf("120"); //String в Byte
        double d = b.doubleValue(); // Byte в double
        short s = (short) d; // double в short
        Character ch = new Character('3');
        int i = Character.digit(ch.charValue(), 10);
        System.out.println("s1=" + s1 + ", s2=" + s2);
        System.out.print("b=" + b + ", s=" + s + ", d=" + d + ", i=" + i);
    }
}