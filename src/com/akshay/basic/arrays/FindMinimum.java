package com.akshay.basic.arrays;

import java.util.Arrays;

public class FindMinimum {
    static void main() {
        int[] arr = {12,3,4,16,-9};
        int n = arr.length;
        // assuming first value is the minimum value
        int minValue = arr[0];

        for(int value : arr){
            if(value < minValue){
                minValue = value;
            }
        }
        System.out.println("Array element are: " + Arrays.toString(arr));
        System.out.println("Minimum value: " + minValue);
    }

}
