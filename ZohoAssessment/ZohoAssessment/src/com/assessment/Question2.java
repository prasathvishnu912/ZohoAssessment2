package com.assessment;

import java.util.Scanner;

public class Question2 {

	static int getValue(int n, int size) {
		int sum = 1;
		for(int i=0; i<size; i++) {
			sum*=n;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		
		int num = sc.nextInt();
		
		int sum = 0;
		int size = (num+"").length();
		
		int n=num;
		while(n>0) {
			sum+=getValue(n%10, size);
			n = n/10;
		}
		
		if(sum==num)
			 System.out.println("Given number is Armstrong Number.");
		else 
			System.out.println("Given number is not a Armstrong Number.");
		

	}

}
