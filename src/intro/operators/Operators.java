package intro.operators;

/**
 * Class Operators
 *
 * Created by yslabko on 11/24/2017.
 */
public class Operators {
    public static void main(String[] args) {
        int a= 10;
        System.out.println("5%1=" + 5 % 1 + "  1%2=" + 1 % 2);
        int b1 = 0b00001010;//10 или 1010
        int b2 = 0b00001001;//9  или 1001
        a+=b1*b2;
        System.out.println("a+=b1*b2 ->" + a);
        int i = 0;
        System.out.println(b1 + "|" + b2 + " = " + (b1 | b2));
        System.out.println(b1 + "&" + b2 + " = " + (b1 & b2));
        System.out.println(b1 + "^" + b2 + " = " + (b1 ^ b2));
        System.out.println("~" + b2 + " = " + ~b2);
        System.out.println(b1 + ">>" + ++i + " = " + (b1 >> i));
        System.out.println(b1 + "<<" + i + " = " + (b1 << i++));
        System.out.println(b1 + ">>>" + i + " = " + (b1 >>> i));
    }
}