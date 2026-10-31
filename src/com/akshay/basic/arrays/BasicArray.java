package com.akshay.basic.arrays;

import java.util.Scanner;

public class BasicArray {
    static void main() {
        // array declaration
        int[] arr;
        // array initialization
        arr = new int[5];

        Scanner sc = new Scanner(System.in);

        // taking array element from user input
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter value for index " + (i));
            arr[i] = sc.nextInt();
        }

        // print array element
        for(int value : arr){
            System.out.println(value);
        }

        System.out.println("------------------------------");
        // array declaration + initialization
        int[] brr = {1,2,3,4,5};

        // traversing array element using for loop
        for(int i=0; i<brr.length; i++){
            System.out.println("Value of index " + (i) + " : " + brr[i]);
        }

        System.out.println("-----------------------------------");
        // traversing array element using forEach loop
        for(int value : brr){
            System.out.println(value);
        }


    }
}
