package Ex_IfElese;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;

        System.out.print("Length of a rectangle: ");
        a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Breadth of a rectangle: ");
        b = sc.nextDouble();
        sc.nextLine();

        if(a == b) {
            System.out.println("It is a square");
        } else {
            System.out.println("It is not a square");
        }
    }
}
