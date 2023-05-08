package Ex_IfElese;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input;

        System.out.print("INPUT: ");
        input = sc.nextDouble();
        sc.nextLine();
        if (input < 0) {
            System.out.println("OUTPUT: " + -input);
        } else {
            System.out.println("OUTPUT: " + input);
        }
    }
}
