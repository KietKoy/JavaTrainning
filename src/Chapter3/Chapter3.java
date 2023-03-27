package Chapter3;

import java.util.Scanner;

public class Chapter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Birthday: ");
        String dateOfBirth = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("Phone: ");
        int phone = sc.nextInt();

        System.out.println("Name: " + name + ", Birthday: " + dateOfBirth + ", Address: " + address + ", Phone: " + phone);
    }
}
