package DSAFUNDAMENTALS;

import java.util.Scanner;

public class average {
	    static int avgRec(int a[], int i, int n)
	    {
	        if (i == n-1)
	            return a[i];
	      
	        if (i == 0)
	            return ((a[i] + avgRec(a, i+1, n))/n);
	      
	        return (a[i] + avgRec(a, i+1, n));
	    }
	    
	    static int average(int a[], int n)
	    {
	         return avgRec(a, 0, n);
	    }
	     
	    public static void main (String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	int arr[]=new int[n];
	    	for(int i=0;i<n;i++) {
	    		arr[i]=sc.nextInt();
	    	}
	      
	        System.out.println(average(arr, n));
	    }
	}

