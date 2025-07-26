package com.nt.algo;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(checkPrimeByFor(a));
        System.out.println(checkPrimeByRecurssion(a,a/2));
    }

    private static boolean checkPrimeByRecurssion(int a,int i) {

        if(i==1)
            return true;
        else if(a%i==0)
            return false;
        else
           return checkPrimeByRecurssion(a,i-1);

    }

    private static String checkPrimeByFor(int a) {
        int factors = 0;
        for(int i=1;i<=a;i++){
            if(a%i==0)
                factors++;
        }
        return factors!=2?"Not prime": "prime";
    }
}
