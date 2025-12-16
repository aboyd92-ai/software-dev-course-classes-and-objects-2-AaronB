package org.example;

// In a separate (adjacent) file, create a Student class with two public members:
// - A String member called name
// - A double member called grade

import java.util.ArrayList;
import java.util.List;

public class BetterStudentManager {

    public List<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        // This method should add a new student to the list of students
        Student student = new Student();
        student.name = name;
        student.grade = grade;
        students.add(student);
    }

    public void removeStudent(String name) {
        // This method should remove the student with the given name from the list of students
        int indexToRemove = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).name.equals(name)) {
                indexToRemove = i;
            }
            if (indexToRemove != -1) {
                students.remove(indexToRemove);
            }
        }
    }

    public String getStudentList() {
            //String getStudentList() {
            // looping through the list of students
            //
            // Replace the following line with your implementation
            String grades = "";
            for (Student student : students) {
                grades += student.name + " " + student.grade + "\n";
            }
            return grades;
        }
    }
