package ManagerStudent;

import ManagerStudent.model.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        List<Student> studentList = new ArrayList<>();
        ShowMenu();
        input = sc.nextInt();
        sc.nextLine();
        while (input > 0 || input < 7) {
            switch (input) {
                case 1:
                    Student student = inputStudent(sc);
                    studentList.add(student);
                    ShowMenu();
                    break;
                case 2:
                    for (Student value : studentList) {
                        value.toString();
                        System.out.println();
                    }
                    ShowMenu();
                    break;
                case 3:
                    List<Student> studentListSorted = sortStudentListByScore(studentList);
                    for(Student value: studentListSorted) {
                        value.toString();
                        System.out.println();
                    }
                    ShowMenu();
                    break;
                case 4:
                    
            }
        }
    }
    public static void ShowMenu() {
        System.out.println("MENU");
        System.out.println("1. Input student");
        System.out.println("2. Show all list student");
        System.out.println("3. Displays the average score of the gradual list of students");
        System.out.println("4. Search course of all student");
        System.out.println("5. Search and show id of a student");
        System.out.println("6. Exit");
        System.out.print("Enter your choose: ");
    }
    public static Student inputStudent(Scanner sc) {
        String id;
        String name;
        String course;
        String address;
        int age;
        double mediumScore;

        System.out.print("Input id: ");
        id = sc.nextLine();

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Input course: ");
        course = sc.nextLine();

        System.out.print("Input address: ");
        address = sc.nextLine();

        System.out.print("Input medium score: ");
        mediumScore = sc.nextDouble();

        return new Student(id, name, age, course, address, mediumScore);
    }
    public static List<Student> sortStudentListByScore(List<Student> studentList) {
        for(int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMediumScore() > studentList.get(i + 1).getMediumScore()) {
                swapStudent(studentList.get(i), studentList.get(i + 1));
            }
        }
        return studentList;
    }
    public static void swapStudent(Student i, Student j) {
        if(i.getMediumScore() > j.getMediumScore()) {
            Student temp = i;
            i = j;
            j = temp;
        }
    }
}
