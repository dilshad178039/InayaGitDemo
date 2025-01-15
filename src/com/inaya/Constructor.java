package com.inaya;

public class Constructor {
	
	int id;
	String name;
	static String compnany;
	double salary;
	
	public Constructor(int id, String name, String company,double salary)
	
	{
		this.id=id;
		this.name=name;
		this.compnany=compnany;
		this.salary=salary;
		
		
	}
	
	public void display()
	{
		System.out.println("Employee details is: "+ id +" "+ name +" "+ compnany +" "+ salary);
	}
	
	public static void main(String[] args) {
		Constructor sc=new Constructor(30606, "Dilshad", "Syne", 85000);
		Constructor sc1=new Constructor(178035, "Dilshad", "CG", 28000);
		
		sc.display();
		sc1.display();
		
	}

}
