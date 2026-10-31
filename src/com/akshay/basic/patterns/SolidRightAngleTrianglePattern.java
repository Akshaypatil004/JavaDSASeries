package com.akshay.basic.patterns;

import java.util.Scanner;

public class SolidRightAngleTrianglePattern {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for n: ");
        int n = sc.nextInt();

        for(int row = 1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
