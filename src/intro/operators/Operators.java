package intro.operators;

import java.util.Scanner;

/**
 * Class Operators
 * <p>
 * Created by yslabko on 11/24/2017.
 */
public class Operators {
    public static void main(String[] args) {
        byte a = -128;
        System.out.println("Enter positive number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        System.out.println("n*n=" + Math.pow(number,2));




        Operators ops = new Operators();

        long b = 1;
        ops.print(a,b);
        ops.print(a,b,b ,b ,b );
        ops.print(a,b, b, b, b,b);
        byte c = (byte) (-230 + 100);
        System.out.println(c);
        System.out.println("a=" + ++a);
        System.out.println("a=" + a);
        System.out.println(35 % 2 == 0);

        System.out.println("5%1=" + 5 % 1 + "  1%2=" + 1 % 2);
        int b1 = 0b00001010;//10 или 1010
        int b2 = 0b00001001;//9  или 1001
        a += b1 * b2;
        System.out.println("a+=b1*b2 ->" + a);
        int i = 0;
        System.out.println(b1 + "|" + b2 + " = " + (b1 | b2));//1011
        System.out.println(b1 + "&" + b2 + " = " + (b1 & b2));//1000
        System.out.println(b1 + "^" + b2 + " = " + (b1 ^ b2));//0011
        System.out.println("~" + b2 + " = " + ~b2);//1111 0110
        System.out.println(b1 + ">>" + ++i + " = " + (b1 >> i));
        System.out.println(b1 + "<<" + i + " = " + (b1 << i++));
        System.out.println(b1 + ">>>" + i + " = " + (b1 >>> i));
        System.out.println(~0b00000011);
        System.out.println((byte) 0b11111100);
        a = 1;
        b = -1;
        if (isValidBoundaryCondition(a, b)) {
            System.out.println("B is greater");
        } else if (a == b) {
            System.out.println("A equals B");
        } else if (a > b) {
            System.out.println("A is greater");
            System.out.println("B is less than A");
        }


        if (a < b) { System.out.println();}
        if (a > b) { System.out.println();}

        switch (a) {
            case 1:
            case 2: System.out.println(); break;
            case 3: System.out.println(); break;
            case 4: System.out.println(); break;
            default:
                System.out.println("default");
        }

        String mama = null;
        System.out.println("мама".equals(mama));
        System.out.println("abc".equalsIgnoreCase("Abc"));

        int n =1;
        int j = 0;
        int arr[] = new int [10];

        for (int element : arr) {
            System.out.println(element);
        }


        switchStructure(i, 2, 10);
        switchStructure(i);
        switchStructure(i,9);
        switchStructure();
    }

    public static void switchStructure(int ... amount) {
        switch (amount[1]) {
            case 1:
            case 3:
            case 5:
                System.out.println("Нечет");
                break;
            default:
        }
    }

    private static boolean  validateDigits() {

        //time consumed
        return false;
    }

    void print(int a, long ... longs) {
        for (long longArg : longs) {

        }

        System.out.println(a);
    }

    public static boolean isValidBoundaryCondition(byte a, long b) {
        return a < b && a + 5 > 55 || b * 10 < 43;
    }

    private static boolean calculate() {
        return false;
    }
}