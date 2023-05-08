package Chapter5.utlis;

import java.util.Scanner;

public class Validator {
    public static String getString(Scanner sc, String s) {
        return sc.nextLine();
    }
    public static int getInt(Scanner sc, String s) {
        return Integer.parseInt(s);
    }
    public static int getInt(Scanner sc, String s, int a, int b) {
        return 0;
    }
    public static double getDouble(Scanner sc, String s) {
        return Double.parseDouble(s);
    }
    public static int getDouble(Scanner sc, String s, double a, double b) {
        return 0;
    }
}
