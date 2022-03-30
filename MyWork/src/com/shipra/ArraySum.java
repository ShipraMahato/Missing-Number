package com.shipra;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		 int sum,n=10;
		 int MissNum;
		 
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Enter first number");
	      int n1 = sc.nextInt();
	     System.out.println("Enter second number");
	      int n2 = sc.nextInt();
	      int arr[] = new int[n];
	      System.out.println("array elements from "+ n1 +"to"+ n2);
	     // sum of all numbers
	     
	      for(int i=n1; i<=n2; i++) {
	          System.out.println(arr[i]);
	      }
	      sum = (n2-n1+1)*((n1+n2)/2);
	      System.out.println(sum);
	      
	}
}
