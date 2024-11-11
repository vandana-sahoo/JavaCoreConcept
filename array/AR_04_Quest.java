package com.array;

public class AR_04_Quest {
public static void main(String[] args) {
	//find number in an array of given index.
	
	int ans = findnum(2);
	System.out.println(ans);
}

public static int findnum(int x){
	
	int a[] = {12,13,14,15};
	
	for(int i=0; i<a.length; i++) {
		if (i == x) {
			return a[i];
		} 
		 
	} 
	return -1;
}


}
