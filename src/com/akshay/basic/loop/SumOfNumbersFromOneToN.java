package com.akshay.basic.loop;

import java.util.Scanner;

public class SumOfNumbersFromOneToN {
    static void main() {
        System.out.println("Print sum of numbers form 1 to n");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter N value:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            sum+= i;
        }
        System.out.println("Sum of 1 to n : " + sum);
    }
}
