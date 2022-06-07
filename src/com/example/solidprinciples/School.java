package com.example.solidprinciples;

import java.util.ArrayList;
import java.util.List;

public class School extends Student implements Percentage{
    static List<StudentDetails> detailsList;
    static List<int[]> marksList;
    static int[] classPercent;

    public static void main(String[] args){

        // list of Students with their marks in Subjects(Eng,Maths,Computers)
        // also implement functionalities like calculate average marks of the class per subject.
        // print students marks and class average marks.
        // calculate percentage of total marks
        // classify the student based on percentage


        marksList = new ArrayList<>();
        School school = new School();
        school.invoke(marksList,3);
        school.deleteStudent(detailsList);
    }

    private void invoke(List<int[]> marksList, int noOfSubjects) {
        String CLASS = "X";
        School.marksList = new ArrayList<>();
        detailsList = Student.addStudent("Avinash",18, new int[]{90, 80, 70}, marksList);
        detailsList = Student.addStudent("raju",18, new int[]{90, 85, 77}, marksList);

        School.marksList = marksList;

        //CalculatePercentage calculatePercentage = new CalculatePercentage(noOfSubjects);
        PrintDetails printDetails = new PrintDetails();
        int[] classPercent = classPercentage(marksList,noOfSubjects);
        printDetails.printStudentDetails(detailsList,classPercent);
        //

    }

    @Override
    public int[] classPercentage(List<int[]> marksList, int noOfSubjects) {
        classPercent = new int[noOfSubjects];
        int[] marks = new int[noOfSubjects];
        for(int i = 0;i<marksList.size();i++){
            for(int j = 0;j<noOfSubjects;j++){
                marks[j] += marksList.get(i)[j];
            }

        }
        for(int i = 0;i<noOfSubjects;i++){
            classPercent[i] = marks[i]/marksList.size();
        }
        System.out.println(classPercent[0]);
        return classPercent;
    }


    @Override
    public void deleteStudent(List<StudentDetails> detailsList) {
        detailsList.remove(0);
        PrintDetails printDetails = new PrintDetails();
        printDetails.printStudentDetails(detailsList,classPercent);
    }
}

