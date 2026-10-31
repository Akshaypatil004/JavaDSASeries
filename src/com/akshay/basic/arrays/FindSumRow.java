package com.akshay.basic.arrays;

import java.util.Arrays;

public class FindSumRow {
    static void main() {
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };

        for(int i=0; i<matrix.length; i++){
            int sum = 0;
            for(int j=0; j<matrix[i].length; j++){
                sum += matrix[i][j];
            }
            System.out.println("Sum of " + (i+1) + " row elements : " + sum);
        }
    }
}
