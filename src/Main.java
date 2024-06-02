import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        int i = 0;
        for (; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[i]);


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

        System.out.println("Task4");

        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 != 0) {
                a[j]++;
            }
        }
            System.out.println(Arrays.toString((a)));
        }
    }