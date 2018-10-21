package com.cristina.Laboratory1.Task2;

public class Main {
    public static void main(String[] args) {

        //creating data forthe first university
        University university1 = new University();
        university1.name = "UTM";
        university1.foundationYear = 1964;

        Student studentUtm1 = new Student();
        studentUtm1.name = "Tatiana Poleacov";
        studentUtm1.age = 20;
        studentUtm1.marc = 9.54d;

        Student studentUtm2 = new Student();
        studentUtm2.name = "Mariana Onica";
        studentUtm2.age = 20;
        studentUtm2.marc = 9.3d;

        Student[] studentiUtm = {studentUtm1, studentUtm2};

        university1.listStudent = studentiUtm;

        for (Student student:studentiUtm) {
            System.out.println(student.name);
        }

        //crating data for second university
        University university2 = new University();
        university2.name = "ASEM";
        university2.foundationYear = 1991;

        Student studentAsem1 = new Student();
        studentAsem1.name = "Dan Gramescu";
        studentAsem1.age = 21;
        studentAsem1.marc = 9.87d;

        Student studentAsem2 = new Student();
        studentAsem2.name = "Elena Tilea";
        studentAsem2.age = 19;
        studentAsem2.marc = 8.56d;

        Student[] studentiAsem = {studentAsem1, studentAsem2};

        university2.listStudent = studentiAsem;

        //creating data for third university
        University university3 = new University();
        university3.name = "USM";
        university3.foundationYear = 1946;

        Student studentUsm1 = new Student();
        studentUsm1.name = "Denis Dragan";
        studentUsm1.age = 22;
        studentUsm1.marc = 7.97d;

        Student studentUsm2 = new Student();
        studentUsm2.name = "Ana Lupan";
        studentUsm2.age = 19;
        studentUsm2.marc = 9.66d;

        Student[] studentiUsm = {studentUsm1, studentUsm2};

        university3.listStudent = studentiUsm;

        double averageUtm, averageAsem, averageUsm, totalAverage;
        averageUtm = university1.getAverageMark(studentiUtm);
        averageAsem = university2.getAverageMark(studentiAsem);
        averageUsm = university3.getAverageMark(studentiUsm);

        System.out.println("Media Utm este " + averageUtm);
        //System.out.println("media utm" + university1.getAverageMark(studentiUtm));
        System.out.println("Media ASEM este " + averageAsem);
        System.out.println("Media USM este " + averageUsm);

        totalAverage = (averageAsem + averageUsm + averageUtm)/3;
        System.out.println("media universitatilor e " + totalAverage);

    }
}
