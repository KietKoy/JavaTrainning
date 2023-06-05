package SessionLoop;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        for(int i = 2; i < 10000; i++) {
            if (count == n) break;
            if(checkNumber(i)) {
                System.out.print(i + " ");
                ++count;
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
