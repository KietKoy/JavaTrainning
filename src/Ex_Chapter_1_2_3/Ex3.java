package Ex_Chapter_1_2_3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        if(a == 0 && b != 0) {
            System.out.println("The equation has no solution");
        }
        else if(a == 0 && b == 0) {
            System.out.println("The equation has infinitely many roots");
        }
        else {
            double res = -b/a;
            System.out.printf("x is " + res);
        }
    }
}
