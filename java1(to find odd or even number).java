import java.io.*;
import java.util.Scanner;
 
class Hello {
	
	
	static public void addition(int m,int n)
	{
		System.out.println(m+n);
	}
 
    
    public static void main (String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Enter a integer");
    	
    	int a;
    	a=in.nextInt();
    	
    	if(a%2==0)
    	
    		System.out.println("Number is even");
    	else
    		
    		System.out.println("Number is odd");
    	
    	
    	
    	    	
        in.close();
    	
    	
    }
}


