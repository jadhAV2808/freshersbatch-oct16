package com.exception;

import java.util.Scanner;

public class ThirdProgram {

	public static void main(String[] args) throws InsufficientBalanceException , IllegalBankTransactionException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("to withdraw ...........TYPE WIITHDRAW/withdraw");
		System.out.println("to deposit ...........TYPE DEPOSIT/deposit");
		String st=sc.next();
		System.out.println("Enter amount");
		double amt=sc.nextDouble();
		SavingAccount ac=new SavingAccount();
		System.out.println("");
		if(st.charAt(0)=='W' || st.charAt(0)=='w')
			ac.withdraw(amt);
		else if(st.charAt(0)=='D' || st.charAt(0)=='d')
			ac.deposit(amt);
		else
			System.out.println("plz provide valid input");
//	    ac.deposit(amt);
//		ac.withdraw(amt);
		
}
}

class SavingAccount
{
	private long id;
	double balance=50000;
	
//	public SavingAccount(long id, double balance) {
//	
//		this.id = id;
//		this.balance = balance;
//		
//	}
//	
	void withdraw (double amount) throws InsufficientBalanceException
	{
	
	    if (amount > balance)
	        throw new InsufficientBalanceException("Balance is insufficient");
	    else
	    	System.out.println("available Amt. :"+(balance-amount));
	    
	}
	void deposit(double amount) throws IllegalBankTransactionException 
	{
		if(amount<0)
			throw new IllegalBankTransactionException("enter valid amount");
		else
	    	System.out.println("available Amt. :"+(balance+amount));

	
}
}
