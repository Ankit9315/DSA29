package DSAFUNDAMENTALS;

import java.util.Scanner;

public class recursivebinary {
	int binarySearch(int arr[], int x)
    {
 
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
    public static void main(String args[])
    {
 
        recursivebinary ob = new recursivebinary();
        Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int arr[]=new int[n];
    	for(int i=0;i<arr.length;i++) {
    		arr[i]=sc.nextInt();
    	}
    	int target=sc.nextInt();
        int result = ob.binarySearch(arr, target);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

}
