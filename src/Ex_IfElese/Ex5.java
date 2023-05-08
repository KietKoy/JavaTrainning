package Ex_IfElese;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark;

        System.out.print("Enter marks: ");
        mark = sc.nextInt();
        sc.nextLine();

        if (mark < 25) {
            System.out.println("The corresponding grade: F");
        } else if (mark < 45) {
            System.out.println("The corresponding grade: R");
        } else if (mark < 50) {
            System.out.println("The corresponding grade: D");
        } else if (mark < 60) {
            System.out.println("The corresponding grade: C");
        } else if (mark < 80) {
            System.out.println("The corresponding grade: B");
        } else {
            System.out.println("The corresponding grade: A");
        }
    }
}
