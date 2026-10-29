package com.akshay.basic.loop;

public class BreakDemo {
    static void main() {
        System.out.println("Stop loop when value become 6");
        for(int i=1; i<=10; i++){
            if(i==6){
                break;
            }
            System.out.println(i);
        }
    }
}
