package com.akshay.basic.strings;

import java.util.Locale;

public class CountVowels {
    static void main() {
        String str = "Java Programming";
        int vowelsCount = 0;

        // approach 1
//        for(int i=0; i<str.length(); i++){
//            char ch = str.toLowerCase().charAt(i);
//            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                vowelsCount++;
//            }
//        }

        // approach 2
        String vowels = "aeiou";
        for(int i=0; i<str.length(); i++){
            if(vowels.contains(String.valueOf(str.charAt(i)))){
                vowelsCount++;
            }
        }
        System.out.println("String : " + str);
        System.out.println("Vowels count : " + vowelsCount);

    }
}
