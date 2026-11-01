package com.akshay.basic.strings;

public class CheckPalindrome {
    static void main() {
        String str = "CIVIC";
        System.out.println("Is " + str + " is palindrome string ? " + isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        String reverse = "";

        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        if(reverse.equals(str)){
            return true;
        }
        return false;
    }
}
