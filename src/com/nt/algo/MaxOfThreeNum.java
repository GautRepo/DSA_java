package com.nt.algo;

import java.util.Scanner;

public class MaxOfThreeNum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        System.out.println(findMaxUsingMath(a,b,c));
        System.out.println(findMaxUsingCondition(a,b,c));

    }

    private static int findMaxUsingCondition(int a, int b, int c) {
        return (a>b && a>c) ? a : (b>c?b:c);
    }

    private static int findMaxUsingMath(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }
}
