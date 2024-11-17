package com.array;

public class AR_05_Quest {
public static void main(String[] args) {
	int ans = sumarray();
	System.out.println(ans);
}
//Sum of Array Elements 
public static int sumarray(){
	int []a = {1,2,4,5,6,7,9};
	
	int sum = 0;
	for(int i=0; i< a.length; i++) {
		sum += a[i];
//		sum ++;
	}
	
	return sum;
}

}
