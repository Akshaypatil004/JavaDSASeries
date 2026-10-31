package com.akshay.basic.arrays;

public class Print2DArray {
    static void main() {
        // 2D array declaration + initialization
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8}
        };
        // print 2D array
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
