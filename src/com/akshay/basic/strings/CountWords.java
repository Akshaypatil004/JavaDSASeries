package com.akshay.basic.strings;

public class CountWords {
    static void main() {
        // basic simple approach
        // not work in all cases
        String str = "Hi there my name is Akshay";
        String[] words = str.split(" ");
        System.out.println("Total words : " + words.length);
    }
}
