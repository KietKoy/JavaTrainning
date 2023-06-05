package SessionLoop;

import java.util.Scanner;

public class SoNguyenToNhoHonN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.nextLine();
        for(int i = 2; i < n; i++) {
            if(checkNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean checkNumber(int n) {
        if( n < 2) return false;
        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
