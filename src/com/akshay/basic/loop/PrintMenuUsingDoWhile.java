package com.akshay.basic.loop;

import java.util.Scanner;

public class PrintMenuUsingDoWhile {
    static void main() {
        int input;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Poha");
            System.out.println("2. Tea");
            System.out.println("3. Vada Pav");
            System.out.println("4. Dosa");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            input = sc.nextInt();
        }while(input != 5);
    }
}
