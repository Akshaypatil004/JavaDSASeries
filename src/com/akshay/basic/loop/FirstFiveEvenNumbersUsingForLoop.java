package com.akshay.basic.loop;

public class FirstFiveEvenNumbersUsingForLoop {
    static void main() {
        System.out.println("First Five Even Numbers using for loop approach 1:");
        for(int i=2; i<=10; i+=2){
            System.out.println(i);
        }
        System.out.println("\nFirst five numbers using for loop approach 2:");
        for(int i = 1; i<=10; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
