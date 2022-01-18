package com.exception;

public class IllegalBankTransactionException extends Exception {
	IllegalBankTransactionException(String msg){
		super(msg);
	}
}
