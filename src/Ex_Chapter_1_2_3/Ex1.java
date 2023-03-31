package Ex_Chapter_1_2_3;

import java.util.Scanner;

public class Ex1 {
    int a;
    int b;

    public Ex1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {;

        Scanner sc = new Scanner(System.in);
        System.out.printf("a: ");
        int a = sc.nextInt();

        System.out.printf("b: ");
        int b = sc.nextInt();
        Ex1 ex1 = new Ex1(a, b);
//        System.out.println("Before swap");
//        System.out.println("a = " + a + ", b = " + b);
//
//        a = a + b;
//        b = a - b;
//        a = a - b;
        
//        System.out.println("------------------");
//        System.out.println("After swap");
        ex1.swap(ex1.a, ex1.b);
        System.out.printf("a = "  + ex1.a + ", b = " + ex1.b);
    }
    public void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        this.a = a;
        this.b = b;
    }
}
