package String1_2.String2;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        char c;
        int pos = -1;
        System.out.println("Enter string: ");
        s = sc.nextLine();

        System.out.println("Enter character: ");
        c = sc.nextLine().charAt(0);

        pos = s.indexOf(c);
        if (pos < 0) {
            System.out.println("String is not contain " + c + " character");
        } else {
            System.out.println("String is contain " + c + " character");
        }
    }

}
