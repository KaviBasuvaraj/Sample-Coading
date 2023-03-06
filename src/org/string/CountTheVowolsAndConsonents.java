package org.string;

public class CountTheVowolsAndConsonents {
	public static void main(String[] args) {
		String s = "kavi kiruthika";
	     String sp = s.replace(" ", "");
	     
	     String vowols = "";
	     int vowol =0;
	     String conson = "";
	     int con = 0;
	     
	     for(int i=0; i<sp.length(); i++){
	         char c = sp.charAt(i);
	         
	         if(c=='a'|| c=='e' || c=='i'|| c=='o'||c=='u'){
	             vowols = vowols +c;
	             vowol++;
	             
	         }
	         
	         else{
	             conson = conson+c;
	             con++;
	         }
	     }
	     System.out.println(vowols);
	     System.out.println(vowol);
	     System.out.println(conson);
	     System.out.println(con);
	}

}
