package com.swtest.chap5;

public class HomeTask {

	public  static int Min(int A, int B) {

		int minVal;
		minVal = A;

		if (B < A)
			minVal = B;

		return minVal;

	}
	public  static int Min2(int A, int B) {

		int minVal;
		minVal = A;

		if (B < A)
			//mutant
			minVal = A;

		return minVal;

	}
	
	public static int Min1(int A, int B) {

		int minVal;
		minVal = A;

		if (B > A)
			minVal = B;

		return minVal;

	}
	
	public static int findVal(int numbers[], int val)
	{
		int findVal=-1;
		for (int i =0; i<numbers.length; i++)
		
		{	
			if(numbers[i]==val)
				findVal=i;
		}
		return findVal;
		
	}
	
	
	public static int findVal1(int numbers[], int val)
	{
		int findVal=-1;
		for (int i =0+1; i<numbers.length; i++)
		
		{	
			if(numbers[i]==val)
				findVal=i;
		}
		return findVal;
		
	}
	
	public static int sum(int[] x)
	{
		
		int s=0;
		for (int i=0; i<x.length;i++)
		{
			s=s+x[i];
			
		}
		return s;
		
	}
	
	
	
	
	public static int sum1(int[] x)
	{
		
		int s=0;
		for (int i=0; i<x.length;i++)
		{
			s=s-x[i];
			
		}
		return s;
		
	}
	
	public static void main(String[] args) {
		//System.out.println(findVal(new int[] {1,2,3}, 2));
		//System.out.println(findVal(null,1));
		//System.out.println(findVal1(new int[]{5},1));
		
		System.out.println(sum(new int[]{5,-5} )+ ": "+ sum1(new int[]{5,-5} ));
		//System.out.println(sum(new int[]{5,5} )+ ": "+ sum1(new int[]{5,5} ));
		//System.out.println(sum(new int[]{5} )+ ": "+ sum1(new int[]{5} ));
		//System.out.println(sum(new int[]{0} )+ ": "+ sum1(new int[]{0} ));
		//System.out.println(sum(new int[]{3,-5} )+ ": "+ sum1(new int[]{3,-5} ));
		//System.out.println(sum(new int[]{5,-5,5,-6} )+ ": "+ sum1(new int[]{5,-5,5,-6} ));
		//System.out.println(Min(2,5 )+ ": "+ Min1(2,5));
		//System.out.println(Min(5,2 )+ ": "+ Min1(5,2));
		//System.out.println(Min(5,2 )+ ": "+ Min2(5,2));
		//System.out.println(Min(2,5 )+ ": "+ Min2(2,5));
		
		
		
	}

}
