package Ex_Chapter4.JavaAssignment;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("n: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
