package org.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task {
	 public static void main(String[] arg){
	       String str = "abbcccdddd";
	       
	    Map<Character,Integer> m = new LinkedHashMap<>();

	         for(int i=0; i<str.length() ; i++){
	               char c = str.charAt(i);
	                 
	        

	           if(m.containsKey(c)){
	                   Integer count  = m.get(c);
	                             m.put(c,count+1);

	           }
	           else{
	              m.put(c,1);

	          }
	       }
	        
	       System.out.println(m);
	    }
}
