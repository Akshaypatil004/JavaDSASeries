package com.akshay.basic.arrays;

public class Array2D {
    static void main() {
        // 2D Array declaration
        int[][] matrix;

        // initialization
        matrix = new int[3][3];

        // 2D array declaration + initialization
        int[][] matrix2 = {
                {1,2,3},
                {4,5,6},
                {6,8,9}
        };

        // accesing 2D element via index

        System.out.println("matrix2[2][2] element : " + matrix2[2][2]);

        // print 2D array
        for(int row=0; row<matrix2.length; row++ ){
            for(int col=0; col<matrix2[0].length; col++){
                System.out.print(matrix2[row][col] + " ");
            }
            System.out.println();
        }

    }
}
