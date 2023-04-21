package Ex_Chapter4.JavaAssignment.Ex1.model;

public class Student {
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
