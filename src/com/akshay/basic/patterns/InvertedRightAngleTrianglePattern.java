package com.akshay.basic.patterns;

import java.util.Scanner;

public class InvertedRightAngleTrianglePattern {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n: ");
        int n = sc.nextInt();

        for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
