package com.inaya;

public class Practise {
public static void main(String[] args) {
	String str="Dilshad Alam";
	String [] words=str.split(" ");
	String uptoke="";

	for(String word: words)
	{
		String rev="";
		for(int i=word.length()-1;i>=0;i--)
		{
			rev=rev+word.charAt(i);
		}
	
		uptoke=uptoke+rev+" ";
		
	}
	System.out.println(uptoke);
	
}
}
