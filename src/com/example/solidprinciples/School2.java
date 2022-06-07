package com.example.solidprinciples;

import java.util.ArrayList;

public class School2 extends School {

    public static void main(String[] args){
        marksList = new ArrayList<>();
        int noOfSubjects = 3;
        detailsList = addStudent("Avinash",18, new int[]{90, 80, 70}, marksList);
        PrintDetails printDetails = new PrintDetails();
        CalculatePercentage calculatePercentage = new CalculatePercentage(noOfSubjects);
        int[] classPercent = calculatePercentage.ClassPercentage(marksList);
        printDetails.printStudentDetails(detailsList,classPercent);
    }
}
