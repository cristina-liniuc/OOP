package com.cristina.Laboratory2.Task1;

public class Box {
    private double lenght;
    private double width;
    private double height;

    public Box(){
        lenght = 1;
        width = 1;
        height = 1;
    }

    public Box(double dimension){
        lenght = dimension;
        width = dimension;
        height = dimension;
    }

    public Box(double lenght, double width, double height){
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    double calculateSurfaceArea(){
        return 2*height*width + 2*height*lenght + 2*lenght*width;
    }

    double calculateVolume(){
        return lenght*width*height;
    }

    @Override
    public String toString() {
        return ("Lenght: " + lenght+" Width: " + width + " Height: " + height);
    }
}


