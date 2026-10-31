package com.akshay.basic.arrays;

import java.util.Scanner;

public class SumOfArrayElement {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // ask user array size
        System.out.println("How many element you want enter ?");
        int n = sc.nextInt();

        // declare and initialize array size
        int[] arr = new int[n];

        // variable to sum of array elements
        int sum = 0;
        // accept array element input from user
        for(int i=0; i<n; i++){
            System.out.println("Enter " + (i+1) + " index value: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Array elements are :");
        for(int value: arr){
            System.out.print(value + " ");
        }
        System.out.println("Sum : " + sum);

    }
}
