package org.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindCountAndOcuuranceOfChar {
	
	public static void main(String[] args) {
		String s = "automation";
		
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(m.containsKey(c)) {
				Integer count = m.get(c);	
				m.put(c, count+1);
				
			}
			else {
				m.put(c, 1);
			}
			
			
		}
	System.out.println(m);
	
	
		
		
	
	
	Set<Entry<Character, Integer>> e = m.entrySet();
	for (Entry<Character, Integer> entry : e) {
		Character key = entry.getKey();
		Integer value = entry.getValue();
		System.out.println("\n"+key);
		System.out.println(value);
	}
	
	
	}

}
