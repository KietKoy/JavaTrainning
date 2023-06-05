package Ex_IfElese;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int number = 0;
        int numberReverse = 0;

        System.out.print("Number: ");
        number = sc.nextInt();
        sc.nextLine();

        while (number > 0) {
            numberReverse *= 10;
            int count = number % 10;
            number /= 10;
            numberReverse += count;
        }
        System.out.println("Number Reverse: " + numberReverse);
    }
}
