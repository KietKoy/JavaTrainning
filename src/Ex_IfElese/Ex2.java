package Ex_IfElese;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;

        System.out.print("a: ");
        a = sc.nextDouble();
        sc.nextLine();

        System.out.print("b: ");
        b = sc.nextDouble();
        sc.nextLine();
        if(a == b) {
            System.out.println("a = b = " + a);
        } else {
            double max = a > b ? a : b;
            System.out.println("Max is " + max);
        }

    }
}
