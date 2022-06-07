package com.example.solidprinciples;

import java.util.ArrayList;
import java.util.List;

public  class School1 extends Student implements Classification,Percentage{
    static List<StudentDetails> detailsList;
    static List<int[]> marksList;
    static int[] classPercent;
    static int noOfSubjects;

    public static void main(String[] args){

        noOfSubjects = 4;

        marksList = new ArrayList<>();
        detailsList = Student.addStudent("Avinash",18, new int[]{90, 80, 70,60},marksList);
        detailsList = Student.addStudent("raju",18, new int[]{90, 85, 77,100}, marksList);



        School1 school1 = new School1();
        school1.claculatePercent();

    }

    public void claculatePercent(){
        PrintDetails printDetails = new PrintDetails();
        int[] classPercent = classPercentage(marksList,noOfSubjects);
        printDetails.printStudentDetails(detailsList,classPercent);
        int sum = 0;
        for(int i = 0;i<classPercent.length;i++){
            sum += classPercent[i];
        }
        School1 school1 = new School1();
        school1.classify(sum/3);
    }

    @Override
    public void classify(int classP) {
        marksList.get(0);
        int sum = 0;
        for(int i = 0;i<marksList.get(0).length;i++){
            sum += marksList.get(0)[i];
        }
        int percent = sum/3;
        if(percent > classP){
            System.out.println("good");
        }
        else{
            System.out.println("average");
        }
    }

    @Override
    public void deleteStudent(List<StudentDetails> detailsList) {

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
}
