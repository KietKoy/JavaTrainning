package Ex_Chapter4.Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int status;
        List<Student> studentList = new ArrayList<>();
        Student student;
        while (true) {
            showMenu();

        }

    }

    static void showMenu() {
        System.out.println("1. Input Student");
        System.out.println("2. Display detail of a Student");
        System.out.println("3.Show all list Student");
        System.out.println("4. Exit program");
    }

    static Student inputStudent(Scanner sc) {
        String id;
        String name;
        int age;
        String course;
        String address;
        String school;
        float mediumScore;
        System.out.println("Student ID: ");
        id = sc.nextLine();
        System.out.println("Student Name: ");
        name = sc.nextLine();
        System.out.println("Student Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Student Course: ");
        course = sc.nextLine();
        System.out.println("Student Address: ");
        address = sc.nextLine();
        System.out.println("Student School: ");
        school = sc.nextLine();
        System.out.println("Student Medium Score: ");
        mediumScore = sc.nextFloat();
        sc.nextLine();
        Student student = new Student(id, name, age, course, address, school, mediumScore);
        return  student;
    }
}
