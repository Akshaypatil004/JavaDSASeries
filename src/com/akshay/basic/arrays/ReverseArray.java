package com.akshay.basic.arrays;

import java.util.Arrays;

public class ReverseArray {
    static void main() {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        System.out.println("Array Elements before reversing : " + Arrays.toString(arr));

        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        System.out.println("Array Element after reversing : " + Arrays.toString(arr));
    }

}
