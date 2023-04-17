package Ex_Chapter_1_2_3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.printf("a: ");
        a = sc.nextInt();

        System.out.printf("b: ");
        b = sc.nextInt();

        System.out.printf("c: ");
        c = sc.nextInt();

//        if(a > b && a > c) {
//            System.out.println("Max is " + a);
//        }
//        else if (b > a && b > c) {
//            System.out.println("Max is " + b);
//        }
//        else {
//            System.out.println("Max is " + c);
//        }

        System.out.println("Max is " + Math.max(c, Math.max(a, b)));
    }
}
