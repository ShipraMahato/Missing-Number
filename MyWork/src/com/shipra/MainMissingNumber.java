package com.shipra;

public class MainMissingNumber {
// finding missing number
	public static void main(String[] args) {
		int a[]= {1,2,4,3};
		//find sum of 1 to n natural numbers
		int s,n=5,ars=0;
		s=n*(n+1)/2; //sum of n natural numbers
		//s=1+2+3+4+5=15
		
		//sum of all array elements
		for(int i=0;i<a.length;i++) {
			ars=ars+a[i];
		}
		int mn=s-ars;
		System.out.println("Missing number "+mn);

	}

}
