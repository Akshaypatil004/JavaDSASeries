package com.akshay.basic.strings;

public class ReverseString {
    static void main() {
        // approach 1
//        String str = "Akshay";
//        String reverse = "";


//        for(int i=str.length()-1; i>=0; i--){
//            reverse = reverse + str.charAt(i);
//        }

//        System.out.println("Original String: " + str);
//        System.out.println("Reverse String: " + reverse);

        // approach 2
        String str = "Akshay";
        char[] strArr = str.toCharArray();
        for(int i=0; i<strArr.length/2;i++){
            char temp = strArr[i];
            strArr[i] = strArr[strArr.length - i - 1];
            strArr[strArr.length - i - 1] = temp;
        }
        String reverse = String.valueOf(strArr);
        System.out.println("Original String: " + str);
        System.out.println("Reverse String: " + reverse);
    }
}
