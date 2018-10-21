package com.cristina.Laboratory4;

import com.cristina.Laboratory5.X;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\Cristina\\Desktop\\one_expresion.txt");
        Scanner scanner = new Scanner(file);
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        String theString;

        theString = scanner.nextLine();
        while (scanner.hasNextLine()){
            theString = theString + "\n" + scanner.nextLine();
        }

        char[] charArray = theString.toCharArray();

        for( int i = 0; i < charArray.length; ++i){
            if (charArray[i] == '(') {
                stack.push(charArray[i]);
            }
            if (charArray[i] == ')'){
                if (stack.isEmpty()) {
                    stack2.push(charArray[i]);
                }
                else {
                    stack.pop();
                }
            }
        }

        if (stack.contains('(')) {
            System.out.println("The expression contains more " + stack.size() + " ) paranthases");
        }
        else {
            if (stack2.contains(')')) {
                System.out.println("The expression contains more " + stack2.size() + " ( paranthases");
            } else {
                System.out.println("The paranthases are put correct in this expression");
            }
        }
    }
}
