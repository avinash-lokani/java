package com.example.solidprinciples;

import java.util.List;

class CalculatePercentage{
    static int noOfSubjects;
    static int[] classPercent;
    CalculatePercentage(int noOfSubjects){
        CalculatePercentage.noOfSubjects = noOfSubjects;
    }
    public int[] ClassPercentage(List<int[]> marksList){


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

        return classPercent;
    }

}

