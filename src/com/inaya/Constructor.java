package com.inaya;

public class Constructor {
	
	String name;
	String company;
	int no;
	int salary;
	
	
	

	public Constructor(String name, String company, int no, int salary) {
		super();
		this.name = name;
		this.company = company;
		this.no = no;
		this.salary = salary;
	}

	public void display(int id, String company)
	{
		System.out.println("Employee details is: "+ id +" "+ name +" "+ company +" "+ salary);
	}
	
	public static void main(String[] args) {
		Constructor sc=new Constructor("Dilshad", "Syne", 85000, 30606);
		Constructor sc1=new Constructor("Dilshad", "CG",178035,  28000);
		
		sc.display(30606, "Dilshad");
		
	}

}
