package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SixthProgram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String username= "pooja";
		 int userpassword= 101 ;
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<=2;i++) {
		String[] s=new String[3];
		int []pwd=new int[3];
		System.out.println("Enter username");
//		String[] s=new String[3];
		 s[i]=bf.readLine();
		System.out.println("Enter password");
		 pwd[i]=Integer.parseInt(bf.readLine());
		
		if(s[i].equals(username) && pwd[i]==userpassword) {
			System.out.println("WelCome "+ username +"!");
			break;
			}
		if(i==2) {
			System.out.println("Contact Admin!");
		}
	
		
			}
	       
				
			

	}

}
