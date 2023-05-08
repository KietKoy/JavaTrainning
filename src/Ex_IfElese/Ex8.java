package Ex_IfElese;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int z;

        System.out.print("x: ");
        x = sc.nextInt();
        sc.nextLine();

        System.out.print("y: ");
        y = sc.nextInt();
        sc.nextLine();

        System.out.print("z: ");
        z = sc.nextInt();
        sc.nextLine();

        System.out.println("x == 2 is " + String.valueOf(x == 2).toUpperCase());

        System.out.println("x != 5 is " + String.valueOf(x != 5).toUpperCase());

        System.out.println("x != 5 && y >= 5 is " + String.valueOf(x != 5 && y >= 5).toUpperCase());

        System.out.println("z != 0 && x == 2 is " + String.valueOf( z != 0 && x == 2).toUpperCase());

        System.out.println("! (y < 10) is " + String.valueOf(!(y < 10)).toUpperCase());
    }
}
