package com.akshay.basic.arrays;

public class ColumnWiseSum {
    static void main() {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8}
        };

        int col = matrix[0].length;
        int j=0;

        while(j<col){
            int sum = 0;
            for(int i=0; i<matrix.length; i++){
                sum += matrix[i][j];
            }
            System.out.println("Col " + (j+1) + " sum : " +sum);
            j++;
        }
    }
}
