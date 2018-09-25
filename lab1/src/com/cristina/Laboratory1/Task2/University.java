package com.cristina.Laboratory1.Task2;

public class University {
    String name;
    int foundationYear;
    Student[] listStudent;


    double getAverageMark(Student[] element){
        double average = 0;
        for (int i =0; i < element.length; ++i){
            average += element[i].marc;
        }
        average = average/element.length;
        return average;
    }
}
