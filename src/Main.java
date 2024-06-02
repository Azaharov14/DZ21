import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");

        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        String[] c = {"Hello", "World"};


        System.out.println("Task2");

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (i == b.length - 1) {
                System.out.println(b[i]);
            } else {
                System.out.print(b[i] + ", ");
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) {
                System.out.println(c[i]);
            } else {
                System.out.print(c[i] + ", ");
            }
        }
        System.out.println("Task3");

        for (int j = a.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.println(a[j]);
            } else {
                System.out.print(a[j] + ", ");
            }
        }
        for (int j = b.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.println(b[j]);
            } else {
                System.out.print(b[j] + ", ");
            }
        }
        for (int j = c.length - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.println(c[j]);
            } else {
                System.out.print(c[j] + ", ");
            }
        }
        System.out.println("Task4");

        for (int q = 0; q < a.length; q++) {
            if (a[q] % 2 != 0) {
                a[q]++;
            }
        }
        System.out.println(Arrays.toString((a)));
    }
}