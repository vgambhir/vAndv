package com.swtest.chap1;

public class FindOcc {

	public static int numZero(int[] x) {
		int count = 0;

		if (x == null)
			throw new NullPointerException();
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 0)
				count++;
		}
		return count;
	}

	public static int findLast(int[] x, int y) {
		int index = -1;

		if (x == null)
			throw new NullPointerException();
		for (int i = 0; i < x.length; i++) {
			if (x[i] == y)
				index = i;
		}
		return index;
	}
	public static int findLast_F(int[] x, int y) {
		int index = -1;

		if (x == null)
			throw new NullPointerException();
		for (int i = x.length-1; i>=0; i--) {
			if (x[i] == y)
				{
				index = i;
				return index;
				}
		}
		return index;
	}
	
	public static int countPositive(int[] x) {
		int count = 0;

		if (x == null)
			throw new NullPointerException();
		for (int i =0; i <x.length; i--) {
			if (x[i] >= 0)
				{
				count++;
				}
		}
		return count;
	}
	
	public static int oddOrPos(int[] x)
	{
		int count = 0;

		if (x == null)
			throw new NullPointerException();
		
		for (int i =0; i <x.length; i++) {
			if( (x[i] > 0) && (x[i] %2 ==1) )
				{
				count++;
				}
		}
		
		return count;
	}
	
	
	
	
	public static int findLastZero(int[] x) {
		int index = -1;

		if (x == null)
			throw new NullPointerException();
		for (int i = x.length-1; i>=0; i--) {
			if (x[i] == 0)
				{
				index = i;
				return index;
				}
		}
		return index;
	}
	public static void main(String[] args) {
		
		System.out.println(0/1);
		//System.out.println(findLast(new int[]{1,2,1},-9));
		//System.out.println(findLast_F(new int[]{1,2,1},1));
		//System.out.println(findLast(null,1));
		//System.out.println(oddOrPos(new int[] {1,2,-1,-2,0,5}));
	}

}
