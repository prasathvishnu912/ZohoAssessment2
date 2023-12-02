package com.assessment;

import java.util.Scanner;

public class Question1 {

	static int[] getFibinacciArray(int n) {
		int[] fibiArr = new int[n];
		fibiArr[0] = 0;
		fibiArr[1] = 1;
		
		for(int i=2; i<n; i++) {
			fibiArr[i] = fibiArr[i-2]+fibiArr[i-1];
		}
		return fibiArr;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		System.out.println("enter the Number: ");
		int n = sc.nextInt();
		if(n<2) {
			System.out.println("Fibinacci series request minimum 2 numbers!!");
		   return;
		}
		int[] fibiArr = getFibinacciArray(n);
		
		for(int i=fibiArr.length-1; i>=0; i--) {
			System.out.print(fibiArr[i]+" ");
		}
		
		
	}

}
