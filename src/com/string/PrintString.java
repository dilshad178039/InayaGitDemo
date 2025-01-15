package com.string;

public class PrintString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ch= {'A','P','P','L','E'};
		
		String str=new String(ch);
		String[] sub=str.split(" ,");
		System.out.println(sub);
		System.out.println(str);
		String ar=" Selnium Java";
		System.out.println(ar.trim());
		
//		Immutable String
		String as1="Ansari is a biggest cast in the muslic community";
		String as2="Dilshad";
		String as3="Dilshad";
		String []sen=as1.split("");
		System.out.println(sen.toString());
		System.out.println(as1);
		String s=String.format("%s%s", as3, as1);
		System.out.println(s.toString());
		
		System.out.println("............................................");
		
		//startWith and endWith method
		
		String arr="Shaista";
		System.out.println(arr.startsWith("sh"));
		System.out.println(arr.endsWith("ta"));
		
		System.out.println("......................");
		
		String Qs=new String("Naaz");    
		String s12=s.intern();    
		System.out.println(s12);//Sachin

	}

}
