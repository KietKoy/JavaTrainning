package Ex_IfElese;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearOfService;
        double salary;

        System.out.print("Year of service: ");
        yearOfService = sc.nextInt();
        sc.nextLine();

        System.out.print("Salary: ");
        salary = sc.nextInt();
        sc.nextLine();

        if(yearOfService > 5) {
            salary += salary * 0.05;
            System.out.print("The net bonus amount of you: " + salary);
        } else {
            System.out.print("The net bonus amount of you: " + salary);
        }
    }
}
