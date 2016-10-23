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
    	
    	int a,m=0,flag=0;
    	
    	a=in.nextInt();
    	
    	m=a/2;         //All even numbers than 2 can be divided by 2
    	
    	for(int i=2;i<m;i++)
    	{
    		if(a%i==0)
    		{
    			System.out.println("Not a prime number");
    			flag++;
    			break;
    		}
    		
    	}
    	
    	if(flag==0)
    	{
    		System.out.println("Number is prime number");
    	}
    	
    	    	
        in.close();
    	
    	
    }
}



