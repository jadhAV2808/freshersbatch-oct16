// Program to calculate income tax
//0-1,80,000              --> 0%
//1,80,001-3,00,000       -->10%
//3,00,001-5,00,000       -->20%
//5,00,001-10,00,000      -->30%

package com.test;

import java.util.Scanner;

public class FifthProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CTC :");
		int ctc=sc.nextInt();
		if(ctc>0 && ctc<=180000) {
			System.out.println("your tax amount is : NIL");
		}
		if(ctc>180000 && ctc<=300000) {
			System.out.println("your tax amount is : " + ctc*0.1);
		}
		if(ctc>300000 && ctc<=500000) {
			System.out.println("your tax amount is : " + ctc*0.2);
		}
		if(ctc>500000 && ctc<=100000) {
			System.out.println("your tax amount is : "+ ctc*0.3);
		}
	}

}
