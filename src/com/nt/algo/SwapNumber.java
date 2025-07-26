package com.nt.algo;

import java.util.Scanner;

public class SwapNumber {

    void swap(int a, int b){
        System.out.println("Before swap a & b "+a +" "+b);
      /*  int c = a;
        a=b;
        b=c;*/
        a= (a+b) - (b=a);
        System.out.println("After swap a & b "+a +" "+b);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a =sc.nextInt();
        System.out.println("Enter the value of b");
        int b =sc.nextInt();
        SwapNumber sn = new SwapNumber();
        sn.swap(a,b);
    }
}
