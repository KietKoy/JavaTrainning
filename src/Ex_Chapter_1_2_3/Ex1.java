package Ex_Chapter_1_2_3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("a: ");
        int a = sc.nextInt();

        System.out.printf("b: ");
        int b = sc.nextInt();

        System.out.println("Before swap");
        System.out.println("a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a -b;

        System.out.println("------------------");
        System.out.println("After swap");
        System.out.printf("a = " + a + ", b = " + b);
    }
}
