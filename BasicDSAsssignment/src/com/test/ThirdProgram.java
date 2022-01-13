
//To find out Simple as well as compound interest

package com.test;

import java.util.Scanner;

public class ThirdProgram {
	
	public static int SimpleInterest(int principal,int rateOfInterest,int time){
		int SI=((principal*rateOfInterest*time)/100);
		return SI;
	}
	
	public static int CompoundInterest(int principal,int rateOfInterest,int time){
		
		int CI=((principal*rateOfInterest*time)/100);
			
			return CI;
		}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount");
		int principal=sc.nextInt();
		System.out.println("Enter Rate of Interest(in %)");
		int rateOfInterest=sc.nextInt();
		System.out.println("Enter Time (in years)");
		int time=sc.nextInt();
		
		
		System.out.println(	"Simple interest is : "+SimpleInterest(principal,rateOfInterest,time) + " Rs" );
		
		System.out.println(	"Compound interest is : "+ CompoundInterest(principal,rateOfInterest,time) + " Rs" );
		
	}

}
