package Ex_Chapter4.JavaAssignment.Ex1;

import Ex_Chapter4.JavaAssignment.Ex1.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Cau a
//        Student student = new Student("ST1", "Truong Tuan Kiet", 20, true);
//        System.out.printf(student.toString());

        //Cau b
//        String studentName;
//        String studentCode;
//        int studentAge;
//        boolean studentSex;
//
//        System.out.print("Student Code: ");
//        studentCode = sc.nextLine();
//        System.out.print("Student Name: ");
//        studentName = sc.nextLine();
//        System.out.print("Student Age: ");
//        studentAge = sc.nextInt();
//        System.out.print("Student Sex: ");
//        studentSex = sc.nextBoolean();
//
//        Student student = new Student(studentCode, studentName, studentAge, studentSex);
//        System.out.println(student.toString());

        //Câu c
        String studentName;
        String studentCode;
        int studentAge;
        boolean studentSex;
        String isContinue = "";
        List<Student> studentList = new ArrayList<Student>();
        Student student;
        while (!isContinue.equalsIgnoreCase("N")) {
            System.out.print("Student Code: ");
            studentCode = sc.nextLine();
            System.out.print("Student Name: ");
            studentName = sc.nextLine();
            System.out.print("Student Age: ");
            studentAge = sc.nextInt();
            sc.nextLine();
            System.out.print("Student Sex: ");
            studentSex = sc.nextBoolean();
            sc.nextLine();
            System.out.print("Continue? (Y/N): ");
            isContinue = sc.nextLine();
            student = new Student(studentCode, studentName, studentAge, studentSex);
            studentList.add(student);
        }
        System.out.println(studentList.size());
    }
}
