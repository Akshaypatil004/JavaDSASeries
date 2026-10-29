package com.akshay.basic.loop;

public class PrintOddNumberFromOneToTwenty {
    static void main() {
        System.out.println("Odd numbers from 1 to 20 using continue");
        for(int i=1; i<=20; i++){
            if(i%2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
