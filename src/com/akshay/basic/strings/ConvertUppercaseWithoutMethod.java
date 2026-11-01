package com.akshay.basic.strings;

public class ConvertUppercaseWithoutMethod {
    static void main() {
       String str = "Akshay";
       char ch = str.charAt(0);
       int value = ch;
        System.out.println("ch : " + ch + ", value : " + value);
        System.out.println((char)(ch+32));

        // ASCII value a-z = 97 - 122
        // ASCII value A-Z = 65 - 90
        String uppercase = "";
        for(int i=0; i<str.length(); i++){
            int charAsciiValue = str.charAt(i);
            if(charAsciiValue >=97 && charAsciiValue <=122){
                charAsciiValue -= 32;
                uppercase = uppercase + (char)charAsciiValue;
            }else{
                uppercase = uppercase + (char)charAsciiValue;
            }

        }
        System.out.println("Original String: " + str);
        System.out.println("Uppercase String : " +uppercase);
    }
}
