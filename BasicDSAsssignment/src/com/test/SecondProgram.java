package com.test;

public class SecondProgram {

	public static void main(String[] args) {
		int temp1=0,temp2=0;
		System.out.print("Armstrong number between 100-999 are : ");
		for(int i=100;i<=999;i++) {
			int copy=i;
//			System.out.print(i);
			for(;copy>0;) {
				temp1=copy%10;
				temp1=temp1*temp1*temp1;
				temp2=temp2+temp1;
				copy=copy/10;
			}
			if(temp2==i) {
				System.out.print(i+" , ");
			}
		}

	}

}
