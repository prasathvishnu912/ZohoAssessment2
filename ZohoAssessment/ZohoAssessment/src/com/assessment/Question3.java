package com.assessment;

import java.util.*;

public class Question3 {

	static Scanner sc = new Scanner(System.in);
	
    static byte[] getSortedArray(byte[] arr){
	   	for(int i=0; i<arr.length; i++) {
	   		for(int j=0; j<arr.length-1-i; j++) {
	   			if(arr[j]>arr[j+1]) {
	   				byte temp = arr[j];
	   				arr[j] = arr[j+1];
	   				arr[j+1] = temp;
	   			}
	   		}
	   	}
	   	return arr;
	}
	
	static byte[] getInputArray(byte n) {
		byte[] arr = new byte[n];
		
		for(byte i=0; i<n; i++) {
			arr[i] = sc.nextByte();
			
			
		}
		
		return arr;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, Integer> pairsList = new HashMap<>(); 
		
		System.out.println("Enter n: ");
		byte n = sc.nextByte();
		System.out.println("Enter the numbers");
		byte[] inputArray = getInputArray(n);
		byte[] sortedArr = getSortedArray(inputArray);
		System.out.println(sortedArr);
		System.out.println("Enter k: ");
		byte k = sc.nextByte();
		
		for(int i : sortedArr) {
			System.out.println(i);
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				int fN = inputArray[i];
				int sN = inputArray[j];
				if(fN<sN&&(fN+sN)%k==0) {
					pairsList.put(fN, sN);
				}
			}
		}
		
		System.out.println(pairsList);

	}

}
