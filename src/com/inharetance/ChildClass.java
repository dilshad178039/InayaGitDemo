package com.inharetance;

public class ChildClass extends Animal {
	String color="red";
	String color1="Pink";
	
	void colorname()
	{
		System.out.println(color);
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildClass nf=new ChildClass();
nf.colorname();
	}

}
