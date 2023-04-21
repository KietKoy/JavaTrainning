package Ex_Chapter4.JavaAssignment;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        int index = n + n - 1;
        int center = (int)(index/2);
        int left = center;
        int right = center;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < index; j++) {
                if (j >= left && j <= right) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            left--;
            right++;
        }
    }
}
