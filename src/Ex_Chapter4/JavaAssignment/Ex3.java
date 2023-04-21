package Ex_Chapter4.JavaAssignment;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.printf("a: ");
        a = sc.nextInt();
        sc.nextLine();
        System.out.printf("b: ");
        b = sc.nextInt();

        int result = greatestCommonDivisor(a, b);
        System.out.println("The greatest common divisor of a and b is " + result);
    }
    static int greatestCommonDivisor(int a, int b) {
        if(a == b)  return a;
        else if(a > b) {
            return greatestCommonDivisor(a-b, b);
        }
        else {
            return greatestCommonDivisor(a, b-a);
        }
    }
}
