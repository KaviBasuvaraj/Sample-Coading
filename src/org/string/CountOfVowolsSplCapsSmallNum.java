package org.string;

public class CountOfVowolsSplCapsSmallNum {
	public static void main(String[] args) {
		String s = "kavi@#%$^TJRT235236 keerthi";
	     
	     String caps ="", spl ="", num ="", smal="";
	     int cap=0,spcl=0,numb=0,small=0;
	     for(int i=0; i<s.length(); i++){
	         char c = s.charAt(i);
	         // int c =x;
	   //  if(c>=65 && c<=90){
	    //   if(c>='A' && c<='Z'){
	    if(Character.isUpperCase(c)){
	         caps=caps+c;
	         cap++;
	     }
	    // else if(c>=97 && c<=122){
	     //  else if(c>='a'&& c<='z'){
	     else if (Character.isLowerCase(c)){
	         smal=smal+c;
	         small++;
	     }
	    // else if(c>=48 && c<=57){
	   //  else if(c>='0'&& c<='9'){
	   else if (Character.isDigit(c)){
	         num=num+c;
	         numb++;
	     }
	     else{
	         spl=spl+c;
	         spcl++;
	     }
	     }
	     
	     System.out.println(caps);
	     System.out.println(cap);
	     System.out.println(spl);
	     System.out.println(spcl);
	     System.out.println(smal);
	     System.out.println(small);
	     System.out.println(num);
	     System.out.println(numb);
	}

	
	

}
