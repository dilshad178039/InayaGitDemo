package com.inaya;

public class Overloading {
	
	public static int add(int a, int b)
	{
		int sum=a+b;
		System.out.println("Addition is: "+sum);
		return sum;
		
	}
	
	public static int sumofthree(int x, int y, int z)
	{
		double sum=x+y+z;
		System.out.println("Addition is: "+sum);
		return (int) x;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add(56, 97);
sumofthree(97, 90, 89);
	}

}
