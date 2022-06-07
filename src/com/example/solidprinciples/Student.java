package com.example.solidprinciples;

import java.util.ArrayList;
import java.util.List;

abstract class Student{
    static List<StudentDetails> detailsList = new ArrayList<>();
    public static List<StudentDetails> addStudent(String name, int age, int[] marks, List<int[]> marksList){
        detailsList.add(new StudentDetails(name,age,marks));
        marksList.add(marks);
        return detailsList;
    }

    public abstract void deleteStudent(List<StudentDetails> detailsList); //naming
}

