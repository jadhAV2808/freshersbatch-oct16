package com.strinAssignment;

public class ThirdProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println("in lowercase : "+str.toLowerCase());
		System.out.println("in lowercase : "+str.toUpperCase());
		String replace=str.replace('a', '$');
		System.out.println("after replacing all a with $ : "+replace);
		if(str.contains("collection")) {
			System.out.println("String contains the word 'collection'");
		}
		else
			System.out.println("'collection' is not there in the string");

	
	 String s="java string pool refers to collection of strings which are stored in heap memory";
	 if(str.equals(s)) {
		 System.out.println("strings matched!");
	 }
	 else 
		 System.out.println("Strings are not matching");

}
	
}
