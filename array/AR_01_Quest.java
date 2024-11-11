package com.array;


public class AR_01_Quest {
	//check/Find a given number in an array and return true if found, otherwise false
	public static void main(String[] args) {
		
		boolean ans = rtntrue();
		System.out.println(ans);
	}	

	
public static boolean rtntrue() {
	int []a = {1,12,34,55,33};
	
	for(int i=0; i<=5-1; i++) {
		if(a[i] == 34) {
			return true;
		}
		
	}
	return false;
}
}