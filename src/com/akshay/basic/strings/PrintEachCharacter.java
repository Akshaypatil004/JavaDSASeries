package com.akshay.basic.strings;

public class PrintEachCharacter {
    static void main() {
        // string creation
        String str = "Akshay";

        System.out.println("String contains characters:");
        for(int i=0; i<str.length(); i++){
            System.out.println("char at index " +(i) + ": " + str.charAt(i));
        }
    }
}
