package SessionLoop;

import java.util.Scanner;

public class BCNN_UCLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.print("a: ");
        a = sc.nextInt();
        sc.nextLine();
        System.out.print("b: ");
        b = sc.nextInt();
        sc.nextLine();
        System.out.println("UCLN: " + UCLN(a, b));
        System.out.println("BCNN: " + BCNN(a, b));
    }
    public static int UCLN(int a, int b) {
        if(a == b) return a;
        else if(a > b) return UCLN(a-b, b);
        else return UCLN(a, b-a);
    }
    public static int BCNN(int a, int b) {
        return ((a * b) / UCLN(a, b));
    }
}
