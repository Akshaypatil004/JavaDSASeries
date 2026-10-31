package com.akshay.basic.arrays;

public class LinearSearch {
    static void main() {
        int[] arr = {12,5,34,2,6};
        int n = arr.length;
        int target = 34;

        boolean flag = false;
        for(int value : arr){
            if(value == target){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found!");
        }

    }
}
