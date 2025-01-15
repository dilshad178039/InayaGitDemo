package com.inaya;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {9,8,7,6,5,4,3};
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		System.out.println("........................");
//		print array in even position
		for(int i=0;i<arr.length;i=i+2)
		{
			
			
				System.out.print(arr[i]);
			
		}
		
//		print array in odd position
		for(int i=1;i<arr.length;i=i+2)
		{
			
			
				System.out.print(" "+arr[i]);
			
		}
		System.out.println("..............");
		System.out.println("Sum of array is: ");
		int sum=0;
//		Sum of array
		for(int i=0;i<arr.length;i++)
		{
			
			 sum=sum+arr[i];
			
				
			
		}
		System.out.print(sum);
//		Ascending Order
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]);
		}
		

	}

}
