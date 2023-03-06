package org.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintTheDuplicateCharacterFromTheString {
	
	 public static void main(String[]arg){
	       String s ="kavikiruthika";
	       Map<Character,Integer> m = new LinkedHashMap<>();
	       
	       for(int i=0; i<s.length(); i++){
	           char c = s.charAt(i);
	           if(m.containsKey(c)){
	               Integer count = m.get(c);
	               m.put(c,count+1);
	           }
	           else{
	               m.put(c,1);
	           }
	       }
	       
	       Set<Entry<Character,Integer>> e = m.entrySet();
	       
	       for(Entry<Character,Integer> e1:e){
	          Integer c1 = e1.getValue();
	          if(c1>1){
	              System.out.println(e1.getKey());
	          }
	        
	           
	       }
	    }
}
