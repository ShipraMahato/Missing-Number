package com.shipra;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
	
		 float sum;
		int n=10;
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Enter first number");
	      int n1 = sc.nextInt();
	      System.out.println("Enter second number");
	      int n2 = sc.nextInt();
	      int arr[] = new int[n];
	      System.out.println("array elements from "+ n1 +"to"+ n2);
	    
	  	      for(int i=n1; i<=n2; i++) {
	          System.out.println(arr[i]);
	      }
	  	    // sum of all numbers
	      sum = (n2-n1+1)*((float)(n1+n2)/2);
	      System.out.println(sum);
	      
	     
	    int[] array = new int[n];  
	    System.out.println("Enter the elements of the array: ");  
	    for(int i=n1; i<n; i++)  
	    {  
	    //reading array elements from the user   
	    arr[i]=sc.nextInt();  
	    }  
	    System.out.println("Array elements are: ");  
	    
	    for (int i=n1; i<n2; i++)   
	    {  
	    System.out.println(array[i]);  
	    } 
	      int sumArr = 0;
	      for(int i=n1; i<=n2; i++) {
	         sumArr = sumArr+arr[i];
	      }
	      float missingNumber = sum-sumArr;
	      System.out.println(" Missing number is : "+missingNumber);
	      sc.close();
	}
	}

