package Ex_Chapter4.JavaAssignment;

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

class Student {
    private String studentCode;
    private String studentName;

    private int studentAge;
    private boolean studentSex;

    public Student(String studentCode, String studentName, int studentAge, boolean studentSex) {
        if (studentCode == null) {

        }
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentSex = studentSex;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public boolean getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Boolean studentSex) {
        this.studentSex = studentSex;
    }

    @Override
    public String toString() {
        String gender = studentSex ? "Male" : "FeMale";
        return "Student Code: " + studentCode + ", Student Name: " + studentName + ", Student Age: " + studentAge + ", Student Sex: " + gender;
    }
}