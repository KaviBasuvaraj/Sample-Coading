package org.string;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountTheWord {
	public static void main(String[] args) {
		String s = "kavi david kavi kavi mahi vishnu kavi vishnu david mahi";
		String[] sp = s.split(" ");
		
		Map<String, Integer> m= new Hashtable<>();
		
		for (int i = 0; i < sp.length; i++) {
			
			String s1 = sp[i];
			if(m.containsKey(s1)) {
				Integer in = m.get(s1);
				m.put(s1, in+1);
			}
			else {
				m.put(s1, 1);
			}
		}
		System.out.println(m);
		
		
		Set<Entry<String, Integer>> e = m.entrySet();
		for (Entry<String, Integer> e1 : e) {
			
		    System.out.println(e1);	
		    
			}
			
		}
		
	

}
