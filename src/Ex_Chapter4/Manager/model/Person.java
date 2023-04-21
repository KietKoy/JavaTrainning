package Ex_Chapter4.Manager.model;

public class Person {
    private int empID;
    private String name;
    private String dateOfBirth;
    private String address;

    public Person(int empID, String name, String dateOfBirth, String address) {
        this.empID = empID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public Person() {
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirths() {
        return dateOfBirth;
    }

    public void setDateOfBirths(String dateOfBirths) {
        this.dateOfBirth = dateOfBirths;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String res = "Student's ID: " + empID + "\nStudent's Name: " + name
                + "\nStudent's Date Of Birth: " + dateOfBirth + "\nStudent's Address: " + address;
        return res;
    }
}
