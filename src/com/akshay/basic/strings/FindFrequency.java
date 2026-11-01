package com.akshay.basic.strings;

public class FindFrequency {
    static void main() {
        // appraoch 1
        String str = "java";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int charFrequency = 0;
            for(int j = 0; j <str.length(); j++){
                if(str.charAt(j) == ch){
                    charFrequency++;
                }
            }
            System.out.println("Frequency of '" + (str.charAt(i)) + "' : " + charFrequency);
        }
    }
}
