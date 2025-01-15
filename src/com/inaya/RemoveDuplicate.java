package com.inaya;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
	String str="dilshad";
	String str2="@#$%^Asif";
	//removing spaces
	String ss=str.replaceAll("\\s", "");
	String ss1=str2.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(ss1);
	System.out.println(ss);
	String [] word=str.split(" ");
	HashMap<String, Integer> hm=new HashMap<String, Integer>();
	for(String words:word)
	{
		if(!hm.containsKey(words))
		{
			hm.put(words, 1);
		}
		else
		{
			hm.put(words, hm.get(words)-1);
		}
	}
	System.out.println(hm);
	//Remove duplicate
	char []ch=str.toCharArray();
//	StringBuilder bf=new StringBuilder();
//	boolean rep=false;
//	for(int i=0;i<ch.length;i++)
//	{
//		for(int j=i+1;i<ch.length-1;j++)
//		{
//			if(ch[i]==ch[j])
//			{
//				rep=true;
//				break;
//			}
//		}
//		if(!rep)
//		{
//			bf.append(ch[i]);
//		}
//	}
//	System.out.println(bf);
	StringBuilder star=new StringBuilder();
	Set<Character> set=new HashSet<Character>();
	for(Character loop:ch)
	{
		set.add(loop);
	}
	System.out.println(star.append(set));
	//Sporting
	char temp;
	for(int i=0;i<ch.length;i++)
		{
		for(int j=i+1;i<ch.length;j++)
		{
			if(ch[i]>ch[j])
			{
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
		}
	for(int i=0;i<ch.length;i++)
	{
		System.out.println(ch[i]);
	}
			
	
		
	

	}

}
