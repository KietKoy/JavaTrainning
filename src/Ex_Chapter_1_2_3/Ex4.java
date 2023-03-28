package Ex_Chapter_1_2_3;

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, x1, x2;

        System.out.printf("a: ");
        a = sc.nextDouble();

        System.out.printf("b: ");
        b = sc.nextDouble();

        System.out.printf("c: ");
        c = sc.nextDouble();

        double delta = b*b - 4*a*c;

        if(delta < 0) {
            System.out.println("The equation has no solution");
        }
        else if (delta == 0) {
            x1 = (-b)/(2*a);
            System.out.println("The equation has double root");
            System.out.println("x1 = x2 = " + x1);
        }
        else {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("The equation has two solutions");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
