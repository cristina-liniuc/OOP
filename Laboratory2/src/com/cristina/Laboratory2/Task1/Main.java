package com.cristina.Laboratory2.Task1;

import com.cristina.Laboratory2.Task1.Box;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(2,3,4);
        System.out.println("Box1 dimensions: "+ box1.toString());
        System.out.println("Surface area of box1 is: " + box1.calculateSurfaceArea());
        System.out.println("Volume of box1 is: " + box1.calculateVolume());
        System.out.println();
        System.out.println("Box2 dimensions: "+ box2.toString());
        System.out.println("Surface of box2 is: " + box2.calculateSurfaceArea());
        System.out.println("Volume of box2 is: " + box2.calculateVolume());
        System.out.println();
        System.out.println("Box3 dimensions: "+ box3.toString());
        System.out.println("Surface of box3 is: " + box3.calculateSurfaceArea());
        System.out.println("Volume of box3 is: " + box3.calculateVolume());
    }
}
