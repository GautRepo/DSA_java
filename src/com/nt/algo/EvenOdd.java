package com.nt.algo;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(checkEvenOrOdd(a));
    }

    private static String checkEvenOrOdd(int a) {
        return a%2==0 ? "Even" : "Odd";
    }
}
