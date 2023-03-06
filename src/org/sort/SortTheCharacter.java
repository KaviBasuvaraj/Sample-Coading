package org.sort;

public class SortTheCharacter {
	
		 public static void main(String args[]) {
		     String s="kavib";
		     char[] c1 = s.toCharArray();
		     
		     for(Character c:c1){
		         System.out.println(c);
		     }
		     
		     for(int i=0; i<c1.length;i++){
		         for(int j=i+1; j<c1.length; j++){
		             if(c1[i]>c1[j]){
		                 char temp = c1[i];
		                 c1[i] = c1[j];
		                 c1[j] = temp;
		             }
		         }
		     }
		     for(char x:c1){
		     System.out.println(x);
		    }
		}
}
