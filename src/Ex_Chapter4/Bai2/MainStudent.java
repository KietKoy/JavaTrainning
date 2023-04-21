package Ex_Chapter4.Bai2;

import Ex_Chapter4.Bai2.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int status;
        List<Student> studentList = new ArrayList<>();
        Student student = new Student();
        while (true) {
            showMenu();
            System.out.printf("Input: ");
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    student = inputStudent(scanner);
                    break;
                case 2:
                    System.out.println(student.toString());
                    showOption();
                    status = scanner.nextInt();
                    scanner.nextLine();
                    if (status == 1) {
                        studentList.add(student);
                    }
                    break;
                case 3:
                    showAllStudent(studentList);
                    break;
                default:
                    System.exit(0);
            }
        }

    }

    static void showMenu() {
        System.out.println("1. Input Student");
        System.out.println("2. Display detail of a Student");
        System.out.println("3. Show all list Student");
        System.out.println("4. Exit program");
    }

    static void showOption() {
        System.out.println("1. Save");
        System.out.println("2. Cancel");
    }

    static Student inputStudent(Scanner sc) {
        String id;
        String name;
        int age;
        String course;
        String address;
        String school;
        float mediumScore;
        System.out.print("Student ID: ");
        id = sc.nextLine();
        System.out.print("Student Name: ");
        name = sc.nextLine();
        System.out.print("Student Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Student Course: ");
        course = sc.nextLine();
        System.out.print("Student Address: ");
        address = sc.nextLine();
        System.out.print("Student School: ");
        school = sc.nextLine();
        System.out.print("Student Medium Score: ");
        mediumScore = sc.nextFloat();
        sc.nextLine();
        Student student = new Student(id, name, age, course, address, school, mediumScore);
        return student;
    }

    static void showAllStudent(List<Student> studentList) {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }
}
