package Ex_IfElese;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double quantity;

        System.out.print("Quantity of item: ");
        quantity = sc.nextDouble();
        sc.nextLine();

        double cost  = quantity * 100;
        if(quantity > 1000) {
            System.out.println("Your total cost is " + cost*0.9);
            System.out.println("You get 10% discount");
        }
        else {
            System.out.println("Your total cost is " + cost);
        }
    }
}
