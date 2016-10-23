import java.io.*;

import java.util.Scanner;
 
class Hello {
	
    
    public static void main (String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	
    	String val,val1="";
    	
    	System.out.println("Enter the string to check for palindrome");
    	
    	val=in.nextLine();
    	
    
    	//System.out.println(val.charAt(0)); // begin
    	
    	//System.out.println(val.charAt(val.length()-1)); // end

    	for(int i=val.length()-1;i>=0;i--)
    	{
    		System.out.println(val.charAt(i));
    		val1+=val.charAt(i);
       	}
    	
    	if(val1.equals(val))
    	
    		System.out.println("Given String is palindrome");
    	
    	else
    		
    		System.out.println("It is not a palindrome");
    	
    	System.out.println();
    	
    	in.close();
    	
    	
    }
}



