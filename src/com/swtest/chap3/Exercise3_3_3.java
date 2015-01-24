package com.swtest.chap3;

public class Exercise3_3_3 {

	public String twoPred(int x, int y) {

		boolean z;
		if (x < y)
			z = true;
		else
			z = false; // x==y || x >y
		
		System.out.println("Value of z ="+ z);
		
		//precedence "+" , "==", &&
		if (z && x + y == 10)
			return "A";
		else
			return "B";

	}
	
	
	
	public static void main(String[] args) {
		Exercise3_3_3 exObj = new Exercise3_3_3();
		System.out.println(exObj.twoPred(1,5));
		System.out.println(exObj.twoPred(4,6));
		System.out.println(exObj.twoPred(5,5));
	}
	

}


