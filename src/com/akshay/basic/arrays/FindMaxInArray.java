package com.akshay.basic.arrays;

import java.util.Arrays;

public class FindMaxInArray {
    static void main() {
        // array declaration + initialization
        int[] arr = {21,4,10,44,6};
        int n = arr.length;
        // assuming first element is the maximum
        int maxValue = arr[0];
        // traverse through all array element and compare
        // whether current array element value is maximum then maxValue
        for(int value : arr){
            if(value > maxValue){
                maxValue = value;
            }
        }
        System.out.println("Array Elements are : " + Arrays.toString(arr));
        System.out.println("Maximum element in an array : " + maxValue);
    }
}
