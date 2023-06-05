package Operator;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextInt();
        sc.nextLine();
        int area = (a+b)*2;
        int perimeter = a * b;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
