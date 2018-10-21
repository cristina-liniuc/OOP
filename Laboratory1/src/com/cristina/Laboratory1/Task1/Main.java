package com.cristina.Laboratory1.Task1;

public class Main {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor();
        monitor1.diagonal = 15.6f;
        monitor1.height = 19;
        monitor1.weight = 33;
        monitor1.colour = "black";

        Monitor monitor2 = new Monitor();
        monitor2.diagonal = 13f;
        monitor2.height = 16;
        monitor2.weight = 29;
        monitor2.colour = "blue";

        Monitor monitor3 = new Monitor();
        monitor3.diagonal = 13f;
        monitor3.height = 16;
        monitor3.weight = 29;
        monitor3.colour = "blue";

        if (monitor1.comparare(monitor2) == true) System.out.println("Monitoarele sunt egale");
        else System.out.println("Monitoarele sunt diferite");

        if (monitor2.comparare(monitor3) == true) System.out.println("Monitoarele sunt egale");
        else System.out.println("Monitoarele sunt diferite");


        //}
    }
}