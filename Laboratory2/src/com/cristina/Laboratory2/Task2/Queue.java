package com.cristina.Laboratory2.Task2;

class Queue {
    int maxSize;
    int[] queArray;
    int front;
    int rear;
    int nItems;

    public Queue(int size) {
        maxSize = size;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void push(int elementAdded) {
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = elementAdded;
        nItems++;
    }


    public int pop() {
        int temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }


    public boolean isEmpty() {
        return (nItems == 0);
    }

    public int size() {
        return nItems;
    }
}