package SessionLoop;

import java.util.Scanner;

public class TongCacSo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n;
        int sum = 0;
        n = sc.nextInt();
        sc.nextLine();
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("OUTPUT: " + sum);
    }
}
