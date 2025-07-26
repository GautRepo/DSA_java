package com.nt.algo;

import java.util.Scanner;

public class MaxNumber{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		MaxNumber max = new MaxNumber();
		System.out.println(max.compare(a,b));
	}
	
	private int compare(int a, int b){
		return a>b?a:b;
	}
	
}