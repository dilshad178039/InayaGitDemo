package com.inaya;

import java.util.HashMap;

public class Frequency {  
    public static void main(String[] args) {  
        //Initialize array  
        String str="HelloDilshad";
      
        String st=str.toLowerCase();
        char ch[]=st.toCharArray();
        
        HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
        for(Character chr:ch)
        {
        	if(!hm.containsKey(chr))
        	{
        		hm.put(chr, 1);
        	}
        	if(hm.containsKey(chr))
        	{
        		hm.put(chr, hm.get(chr)+1);
        	}
        }
        System.out.println(hm);
        
        //Array fr will store frequencies of element  
        /*int [] fr = new int [arr.length]; 
     
        int visited = -1;  
        for(int i = 0; i < arr.length; i++)
        {  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j])
                {  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
        //Displays the frequency of each element present in array  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
   if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  */
    }}  