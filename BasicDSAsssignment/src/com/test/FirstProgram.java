
// program to check that entered number is Armstrong number or not
//Armstrong number=a number that is equal to the sum of the cubes of its own digits.

package com.test;

import java.util.Scanner;

public class FirstProgram {
	
	
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=sc.nextInt();
		int copy=number;
		int temp1=0,temp2=0;
		for(;number>0;){
			temp1=number%10;
			temp1=temp1*temp1*temp1;
			temp2=temp2+temp1;
			number=number/10;
		}
		if(temp2==copy)
			System.out.println(" The Number entered is an Armstrong number ");
		else
			System.out.println(" The Number entered is NOT an Armstrong number ");

			
	}

}
