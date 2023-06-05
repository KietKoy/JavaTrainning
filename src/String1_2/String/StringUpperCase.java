package String1_2.String;

import java.util.Scanner;

public class StringUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        System.out.print("Enter string: ");
        s = sc.nextLine();

        System.out.println("String uppercase: " + s.toUpperCase());
    }
}
