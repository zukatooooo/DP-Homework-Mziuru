package org.example.N1;

public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int age;
    private University university;

    public Student(String firstName, String lastName, String id, int age, University university) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
        this.university = university;
    }

    public void printInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Id: " + id);
        System.out.println("Age: " + age);
        System.out.println("University: " + university.getName());
        System.out.println("Is State University: " + university.isStateUniversity());
        System.out.println("Faculties: " + university.getFaculties());
    }
}
