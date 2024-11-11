package com.array;



public class AR_03_Quest {
//find maximum and minimum
	public static void main(String[] args) {
		
		int a[] =  {27,13,17,22,64}; //by passing parameter
		int max = findmax(a);   //actual argument
		System.out.println(max);
		
		int min = findmin (a);
		System.out.println(min);
	}
	
	public static int findmax(int a[]){
		int y = 0;                //assign zero to compare with other number is greater or not.
	for(int i=0; i<a.length; i++) {
		if(a[i] > y) {
			y = a[i]; 
		}
		
	}
	return y;
	}
	
	public static int findmin(int a[]) //formal argument
	{
	    int z = Integer.MAX_VALUE;   //max value of integer
		for(int i=0; i<a.length; i++) {
			if(a[i] < z){
				z = a[i];
			}
		}
		return z;
		
	}
	
}
