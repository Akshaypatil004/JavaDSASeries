package com.akshay.basic.strings;

public class CountConsonants {
    static void main() {
        String str = "Java";
        int totalConsonants = countConsonants(str);
        System.out.println("str: " + str);
        System.out.println("Consonants Count : " + totalConsonants);
    }
    public static int countConsonants(String str){
        int consonantsCount = 0;
        String vowels = "aeiouAEIOU";

        for(int i=0; i<str.length(); i++){
            if(!vowels.contains(String.valueOf(str.charAt(i)))){
                consonantsCount++;
            }
        }
        return consonantsCount;
    }

}
