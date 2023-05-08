package Ex_IfElese;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.print("Year: ");
        year = sc.nextInt();
        sc.nextLine();

        if(year % 400 == 0) {
            System.out.println(year + " is a leap");
        } else if(year % 100 == 0) {
            System.out.println(year + " is not a leap");
        } else if( year % 4 == 0 ) {
            System.out.println(year + " is a leap");
        } else {
            System.out.println(year + " is not a leap");
        }
    }
}
