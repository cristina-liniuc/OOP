package com.cristina.Laboratory2.Task2;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);

        myQueue.push(3);
        myQueue.push(5);
        myQueue.push(7);
        myQueue.push(9);

        myQueue.pop();

        myQueue.push(50);

        System.out.println("The queue has " + myQueue.size() + " elements");

        while (!myQueue.isEmpty()) {
            int n = myQueue.pop();
            System.out.print(n);
            System.out.print(" ");
        }

    }
}