package com.swtest.chap1;
/**
 * 
 * What is a fault, what is an error.
 * @author vgambhir
 *
 */
public class Example1 {
	
//Find number of occurence of 0 in the array	
	public static int numZero(int[] arr)
	{
		int count =0;
		for(int i = 0; i< arr.length; i++)
		{
			if(arr[i]==0)
				count++;
			
		}
		return count;
		
	}
	
	public static int numZeroFault(int[] arr)
	{
		int count =0;
		// i=1 is a fault
		//Error - Error i is 1 and not zero
		for(int i = 1; i< arr.length; i++)
		{
			if(arr[i]==0)
				count++;
			
		}
		return count;
		
	}
	

}
