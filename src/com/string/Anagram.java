package com.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Burger";
String s2="Regbur";
s1=s1.toLowerCase();
s2=s2.toLowerCase();
char ch[]=s1.toCharArray();
char ch1[]=s2.toCharArray();
Arrays.sort(ch);
Arrays.sort(ch1);
if(ch.equals(ch1))
{
	System.out.println("String is Anagram");

}
else
{
	System.out.println("String not a Anagram");
}


	}

}
