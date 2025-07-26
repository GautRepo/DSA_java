package com.nt.algo;

import java.util.Scanner;

public class SumOfNnaturalNum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int a = sc.nextInt();
        System.out.println(usingForLoop(a));
        System.out.println(usingRecurssion(a));
        System.out.println(usingMath(a));
    }

    private static int usingForLoop(int n){
        int sum =0;

        for(int i=0;i<=n;i++){
            sum = sum+i;
        }

        return sum;
    }

    private static int usingRecurssion(int n){
        if(n==0)
            return 0;

        return n + usingRecurssion(n-1);

    }

    private static int usingMath(int n){
        return n*(n+1)/2;
    }


}
