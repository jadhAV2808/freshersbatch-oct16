package com.test;

import java.util.Scanner;

public class SeventhProgram {

	public static void main(String[] args) {
		boolean decision=false;
		int[] arr= {5,12,17,87,19,1,23,26,35,37,7,53,86,41};
		Scanner sc=new Scanner(System.in);
		System.out.println("guess the number :");
		int guess=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==guess) {
				decision=true;
				break;	
			}
		  
		}
		if(decision) {
			System.out.println("You guessed correct!!!");
			System.out.println("   The number is in the array.");
		}
		else {
 
			  System.out.println("oops!!!");
     		  System.out.println("The number is not in the array");
				
		}
		
	}

}


