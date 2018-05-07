package lecture03_loops.arraays;

import java.util.Random;

/**
 * Class ArrayDemo
 *
 * Created by yslabko on 05/07/2018.
 */
public class ArrayDemo {
    public static void main(String[] args) {
//        arrayDemo();
        array2DimentionDemo();
    }

    private static void array2DimentionDemo() {
        int[][] array = {
                {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}
        };
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }

    private static void arrayDemo() {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("initial array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }

        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }

        System.out.println("new array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "   ");
        }
    }
}
