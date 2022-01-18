package com.exception;

import java.util.Scanner;

public class SecondProgram {

	public static void main(String[] args) {
		int div=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend");
		int i=sc.nextInt();
		System.out.println("Enter divisor");
		int j=sc.nextInt();
		try {
			
			div=i/j;
			System.out.println("Division result : " +div);
		}
		catch(ArithmeticException e){
			System.out.println("UnsupporedOperationException" );
//			e.printStackTrace();
//			System.out.println("please enter non-zero number");
//			int  n=sc.nextInt();
//			System.out.println("Result :- "+div);
			
			
		}
	}

}
