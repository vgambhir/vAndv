package com.vv.class1;
/**
 * Tests:
 * 
 * 
 * 
 */
public class SortAlgo {
	
	// sort the passed arr in place
	public static void sort(int[] arr)
	{
		// modifying the input array inplace
		// pre-state of method
		
		for (int i =0; i< arr.length;i++)
		{
			
		}
			
		// post state of array
		
		
	}
	
	// make a copy, update their inputs
	//
	
	
	
	/*
	 * Tests to include
	 * 1. size of arr passed remains the same arr.lenght->sort(arr)->arr.lenght
	 * 2. element in the array passed exists in the resultant sorted array
	 * 3. Dupes: Frequency of elements in array passed is same in the resultant sorted array
	 * 4. resultant array elements are sorted [0]<[1]<[2]
	 * 5. Will need to make a copy of passed array to calcuate diff - pre and post state
	 * 6. handle null and 0 length array
	 * Output is the permutation of the input - it preserves cardinality
	 * Order O(n)  performance
	 * large, pre-sorted, 1 element, null, empty, maxInt,reverse, 
	 */
	public static void main(String[] args) {
		int [] arr = new int[]{1,2,3};
		int [] preArr= new int[arr.length];
		System.arraycopy(arr, 0, preArr, 0, arr.length);
		sort(arr);
		
		
		
	}

}
