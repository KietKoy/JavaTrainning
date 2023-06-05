package SessionLoop;

import java.util.Scanner;

public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        if (checkNumber(n)) {
            System.out.print(n);
            return;
        }
        while( n > 2) {
            for(int i = 2; i <= n; i++) {
                if (checkNumber(n / i)) {
                    int temp = n/i;
                    System.out.print(temp + "*");
                    n = i;
                    break;
                }
            }
        }
        if(n == 2) System.out.print(n);
    }

    public static boolean checkNumber(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
