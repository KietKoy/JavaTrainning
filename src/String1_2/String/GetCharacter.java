package String1_2.String;

import java.util.Scanner;

public class GetCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int position;

        System.out.print("Enter string: ");
        s = sc.nextLine();

        System.out.print("Enter position: ");
        position = sc.nextInt();
        sc.nextLine();
        System.out.print("The character at position " + position + " is " + s.charAt(position));
    }
}
