package com.assessment;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number: ");
		
		int n = sc.nextInt();
		
		int endCount = 1;
		
		for(int i=n; i>0; i--) {
			for(int l=0; l<i; l++)
				 System.out.print("  ");
			for(int k=1; k<=endCount; k++) 
				System.out.print(k+" ");
			for(int j=endCount-1; j>0; j--)
				 System.out.print(j+" ");
			System.out.println();
			endCount++;
		}
		
		
	}

}
