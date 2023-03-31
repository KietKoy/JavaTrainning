package Ex_Chapter_1_2_3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mathScore, physicsScore, chemistryScore;
        System.out.printf("Math Score: ");
        mathScore = sc.nextDouble();

        System.out.printf("Physics Score: ");
        physicsScore = sc.nextDouble();

        System.out.printf("Chemistry Score: ");
        chemistryScore = sc.nextDouble();

        double avg = (mathScore + physicsScore + chemistryScore) / 3;
        System.out.println("Average score: " + avg);

        String rank = "";
        if (avg >= 8.0) {
            rank = "A";
        } else if (avg >= 6.5) {
            rank = "B";
        } else if (avg >= 5.0) {
            rank = "C";
        } else {
            rank = "D";
        }
        System.out.println("Average is: " + avg + "Rank is: " + rank);
    }
}
