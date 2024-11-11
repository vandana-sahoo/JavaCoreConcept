package com.array;


public class AR_02_Quest {
//find a given number index number if found return index otherwise -1.
	public static void main(String[] args) {
		int ans = findidx(33);
		System.out.println(ans);
	}


public static int findidx(int x) {
	int[]a = {22,33,44,55,66};
	
	for(int i=0; i<a.length ; i++) {
		if(a[i] == x) {
			return i;
		}
		
	}
	return -1;
}

}