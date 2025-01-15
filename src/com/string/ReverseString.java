package com.string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Hello All my name is Dilshad";
		st=st.toLowerCase();
		
		String rev="";
		int c=0;
		System.out.println("Strign is: "+rev.toString());
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
			if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u')
			{
				c++;
			}
		}
		System.out.println(rev);
		System.out.println("Vowel is: "+ c);
		
		

	}

}
