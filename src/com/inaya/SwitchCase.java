package com.inaya;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice: ");
	String n=sc.next();

	switch(n)
	{
	case "a":
		System.out.println("Vowel");
		break;
	
case "e":
	System.out.println("Vowel");
	break;

case "i":
	System.out.println("Vowel");
	break;

case "o":
	System.out.println("Vowel");
	break;

case "u":
	System.out.println("Vowel");
	break;
	default:
		System.out.println("Consonent");
}
	}

}
