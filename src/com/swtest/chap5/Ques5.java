package com.swtest.chap5;

public class Ques5 {

	static int[] accumulate(int[] arr, int k) {
		// precondition: arr != null && for each element e in arr: 0 <= e <= k
		// postcondition: result is an array of length k + 1;
		// result[i] (for 0 <= i <= k) is the number of arr
		// elements that are no more than i;
		// if input array is empty, result has all zeros
		int[] result = new int[k + 1];
		for (int j = 0; j < arr.length; j++) {
			result[arr[j]] = result[arr[j]] + 1;
		}
		for (int i = 1; i <= k; i++) {
			result[i - 1] = result[i] + result[i - 1];
		}
		return result;
	}

	public static void main(String[] args) {
		
		accumulate(new int[]{5,2,1,9}, 10);
		

	}

}
