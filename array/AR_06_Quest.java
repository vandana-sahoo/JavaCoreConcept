package com.array;

public class AR_06_Quest {
//reverse an array
public static void main(String[] args) {
	int [] ans = reverseArray();
	System.out.println("ans is : ");
	for (int num : ans) {
	    System.out.print(num + " ");
	}

	
	
	
}
//Reverse an Array
public static int[] reverseArray() {
	
	int arr[] = {11,22,33,44,55,66};  //array list
	
	int reverseArr[] = new int[arr.length];  //new black array for storing
	
	for(int i=0; i<arr.length; i++) {
		reverseArr[i] = arr[arr.length-1-i];  // 6-1 = 5 ,now i=0 , 5-0=5
	}
	
	return reverseArr;
	
}

}
