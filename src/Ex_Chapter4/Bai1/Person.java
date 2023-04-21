package Ex_Chapter4.Bai1;

public class Person {
    private int empID;
    private String name;
    private String dateOfBirths;
    private String address;

    public Person(int empID, String name, String dateOfBirths, String address) {
        this.empID = empID;
        this.name = name;
        this.dateOfBirths = dateOfBirths;
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
        return dateOfBirths;
    }

    public void setDateOfBirths(String dateOfBirths) {
        this.dateOfBirths = dateOfBirths;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String res = "Student's ID: " + empID + ", Student's Name: " + name
                + ", Student's Date Of Birth: " + dateOfBirths + ", Student's Adress: " + address;
        return res;
    }
}
