package String1_2.String;

import java.util.Scanner;

public class ConcatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        String s2;

        System.out.print("Enter first string: ");
        s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        s2 = sc.nextLine();

        System.out.println("Concat string: " + s1.concat(s2));
    }
}
