package com.akshay.basic.strings;

public class CountLength {
    static void main() {
        String str = "Java";
        int count = 0;

        for(int i=0; i<str.length(); i++){
            count++;
        }

        System.out.println("Total number of character in a string: " +count);
    }
}
