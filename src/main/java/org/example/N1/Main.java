package org.example.N1;

public class Main {
    public static void main(String[] args) {
        University university = University.getInstance();
        Student student = new Student("givi", "vigacidze", "cv23v62v", 18, university);
        student.printInfo();
    }
}