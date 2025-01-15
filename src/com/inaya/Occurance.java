package com.inaya;

import java.util.HashMap;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="dilshad";
char maxChar=' ';
int max=0;
char ch[]=str.toCharArray();
HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
for(Character c:ch)
{
	if(hm.containsKey(c)) {
		hm.put(c, hm.get(c)+1);
	}
	else
	{
		hm.put(c,1);
		
	}
	if(max<hm.get(c))
	{
		maxChar=c;
		max=hm.get(c);
		
	}
}
System.out.println(hm);
System.out.println(maxChar+" "+max);



	}

}
