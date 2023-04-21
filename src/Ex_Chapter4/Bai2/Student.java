package Ex_Chapter4.Bai2;

public class Student {
    private String id;
    private String name;
    private int age;
    private String course;
    private String address;
    private String school;
    private float mediumScore;
    private String classification;

    public Student() {
    }

    public Student(String id, String name, int age, String course, String address, String school, float mediumScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
        this.school = school;
        this.mediumScore = mediumScore;
        if(mediumScore < 4) {
            this.classification = "Weak";
        } else if (mediumScore >= 4 && mediumScore <6) {
            this.classification = "Medium";
        } else if (mediumScore >= 6 && mediumScore < 8) {
            this.classification = "Good";
        } else {
            this.classification = "Very Good";
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public float getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(float mediumScore) {
        this.mediumScore = mediumScore;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        String result = "";
        result = "Student ID: " + id
                + "\n Student Name: " + name
                + "\n Student Age: " + age
                + "\n Student Course: " + course
                + "\n Student Address: " + address
                + "\n Student School: " + school
                + "\n Student Medium Score: " + mediumScore
                + "\n Student Classification: " + classification;
        return result;
    }
}
