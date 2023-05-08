package Ex_IfElese;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int oldest = 0;
        int youngest = 0;

        System.out.print("a: ");
        a = sc.nextInt();
        sc.nextLine();

        System.out.print("b: ");
        b = sc.nextInt();
        sc.nextLine();

        System.out.print("c: ");
        c = sc.nextInt();
        sc.nextLine();

        if(a >= b && a >= c) {
            oldest = a;
            youngest  = b > c ? c : b;
        }
        if(b >= a && b >= c) {
            oldest = b;
            youngest = a > c ? c : a;
        }
        if(c >= a && c >= b) {
            oldest = c;
            youngest = a > b ? b : a;
        }
        System.out.println("Oldest: " + oldest);
        System.out.println("Youngest: " + youngest);
    }
}
