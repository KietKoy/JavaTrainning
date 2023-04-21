package Ex_Chapter4.Manager;

import Ex_Chapter4.Manager.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setEmpID(1);
        person.setName("Tuan Kiet");
        person.setDateOfBirths("18-07-2002");
        person.setAddress("Quang Nam");
        System.out.println(person.toString());
    }
}

