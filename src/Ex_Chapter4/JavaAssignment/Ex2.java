package Ex_Chapter4.JavaAssignment;

import java.util.*;


public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        while(input < 1 || input > 12) {
            System.out.println("Input err! Type input again!");
            input = sc.nextInt();
        }
        Calendar cal = Calendar.getInstance();
        int daysInMonth = 0;
        //Sử dụng switch case
        switch (input) {
            case 1, 3, 5, 7, 8, 10, 12 -> daysInMonth = 31;
            case 4, 6, 9, 11 -> daysInMonth = 30;
            default -> {
                if (cal.get(Calendar.YEAR) % 4 == 0 && cal.get(Calendar.YEAR) % 100 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
            }
        }
        System.out.println(input + " has " + daysInMonth + " days");

        //Sử dụng thư viện YearMonth
//        YearMonth yearMonth = YearMonth.now().withMonth(input);
//        int daysInMonth = yearMonth.lengthOfMonth();
//        System.out.println(input + "has " + daysInMonth + " days");
    }

}
