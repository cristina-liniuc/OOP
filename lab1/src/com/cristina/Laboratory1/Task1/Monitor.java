package com.cristina.Laboratory1.Task1;

public class Monitor {
    float diagonal;
    int height;
    int weight;
    String colour;

    boolean comparare (Monitor m2){
        return height == m2.height && weight == m2.weight && diagonal == m2.diagonal && colour.equals(m2.colour);
    }
}
