package com.akshay.basic.strings;

public class CheckStringContainsOnlyDigit {
    static void main() {
        String str = "12A45";
        System.out.println("is string contains only digit ? " + isContainDigitOnly(str));
    }
    public static boolean isContainDigitOnly(String str){
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i) >= 'a' && str.charAt(i) <= 'a') || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                return false;
            }
        }
        return true;
    }
}
