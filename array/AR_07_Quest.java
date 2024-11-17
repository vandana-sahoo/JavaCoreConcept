package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AR_07_Quest {
//Count how many elements in the array are even and how many are odd.
	
	public static void main(String[] args) {
		
		//call the even odd method and get result.
		int[] ans = EvenOdd(); 
		
		
//		print result
		System.out.println("evencount is: "+ans[0]);
		System.out.println("oddcount is: "+ans[1]);
		System.out.println(Arrays.toString(ans));
	}
	
	public static int[] EvenOdd() {
		
		int []arr = {1,2,3,4,5,6,7};
		int even = 0;
		int odd = 0;
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				even++;
				System.out.println("even");
			}else {
				odd++;
				System.out.println("odd");
			}
		}
		
		return new int[] {even,odd};
		
	}
	
}
