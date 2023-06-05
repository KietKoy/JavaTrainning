package String1_2.String;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        String s2;

        System.out.print("Enter first string: ");
        s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        s2 = sc.nextLine();

        int result = s1.compareToIgnoreCase(s2);

        if(result < 0) {
            System.out.println("s1 is greater than s2");
        } else if(result == 0) {
            System.out.println("s1 is equal to s2");
        } else {
            System.out.println("s1 is less than s2");
        }
    }
}
