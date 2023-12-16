package org.example.N1;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private boolean isStateUniversity;
    private List<String> faculties;

    private static University instance = null;

    private University() {
        this.name = "Sample University";
        this.isStateUniversity = true;
        this.faculties = new ArrayList<>();
        this.faculties.add("ragaca faqulteti 1");
        this.faculties.add("da 2");
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public boolean isStateUniversity() {
        return isStateUniversity;
    }

    public List<String> getFaculties() {
        return faculties;
    }
}
