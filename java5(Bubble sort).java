import java.io.*;

import java.util.Scanner;

class Hello {
	
    
    public static void main (String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	int i,n,temp;
    	System.out.println("Enter the size of array");
    	n=in.nextInt();
    	
    	int arr[] = new int[n];          //INITIALIZING THE ARRAY
    	
    	System.out.println("Enter the numbers in array");
    	for(i=0;i<n;i++)
    	{
    		in=new Scanner(System.in);
    		arr[i]=in.nextInt();
    	}
    	
    	
    	for(i=0;i<(n-1);i++)
    	{
    		for(int j=0;j<(n-i-1);j++)
    		{
    			if(arr[j]>arr[j+1])             //SORTING USING BUBBLE SORT
        		{
        			temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        			
        		}
    		}
    	}
    	
    	System.out.println("Display sorted array");
    	for(i=0;i<n;i++)
    	{
    		System.out.println(arr[i]);
    	}
    	
    	
    	in.close();
    	
    	
    }
}



