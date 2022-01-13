
//supply marks of three subjects and declare result according to following conditions:
// condition1: All subjects marks greater than 60 is passed
// condition2: any two subjects marks greater than 60 is promoted
// condition2: anyone subject's marks 60 or all subject mars less than 60 is failed

package com.test;

import java.util.Scanner;

public class FourthProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter each subjects mark one by one");
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		
		if(sub1>60 && sub2>60 && sub3>60) {
			System.out.println("You are Passed!");
		}
	    else if((sub1>60 && (sub2>60 || sub3>60)) || (sub2>60 && (sub1>60||sub3>60))){ 
			System.out.println("You are Promoted!");
	}
		else {
			System.out.println("You are Failed!");
		}
		
		
		
		

	}

}
