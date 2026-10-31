package com.akshay.basic.patterns;

import java.util.Scanner;

public class HollowSquare {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of n: ");
        int n = sc.nextInt();

        // approach 1
//        for(int row = 1; row<=n; row++){
//            if(row > 1 && row < n){
//                for(int col=1; col<=n; col++){
//                    if(col > 1 && col < n){
//                        System.out.print("  ");
//                    }else {
//                        System.out.print("* ");
//                    }
//                }
//            }
//            else{
//                for(int col=1; col<=n; col++){
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }

        // approach 2
        for(int row = 1; row<=n ; row++){
            for(int col = 1; col<=n; col++){
                if(row == 1 || row == n || col == 1 || col == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
