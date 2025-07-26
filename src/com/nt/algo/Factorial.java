package com.nt.algo;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int a = sc.nextInt();
        System.out.println(factorialByRecursion(a));
        System.out.println(factorialByFor(a));
    }

    private static int factorialByFor(int a) {
        int fact =1;
        for(int i=1; i<=a;i++){
            fact= fact*i;
        }
        return fact;
    }

    private static int factorialByRecursion(int a) {

        if(a==0)
            return 1;

        return a*factorialByRecursion(a-1);
    }
}
