import java.io.*;

import java.util.Scanner;
 
class Hello {
	
    
    public static void main (String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	
    	int n;
    	
    	System.out.println("Enter the number");
    	
    	n=in.nextInt();
    	
    	if((n & (n - 1)) == 0)
    		System.out.println("It is power of 2");
    	else
    		System.out.println("It is not a power of 2");
    	
    	
    	
    	in.close();
    	
    	
    }
}



