package com.inaya;

import java.util.Arrays;

public class CopyArray {
	public static void min(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				int temp=arr[i];
				arr[j]=arr[i];
				arr[j]=temp;
				}
			}
				
		System.out.println(arr);
		}
		
		
	}
	public static void main(String[] args) {
		int[]arr= {23,56,87,90,12,67};
		int[] arr2=new int[arr.length];
		min(arr);
	
		
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=arr[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
			
	}

}
