package com.swtest.chap3;

//Introduction to Software Testing
//Authors: Paul Ammann & Jeff Offutt
//Chapter 3, section 3.3, page 121

//Jeff Offutt--Java version Feb 2003
//Classify triangles
//sum of the 2 sides should always be greater than or equal to or greater than 3rd side
import java.io.*;

class trityp {
	private static String[] triTypes = { "", // Ignore 0.
		/*1*/	"scalene", /*2*/"isosceles", /*3*/"equilateral",/*4*/ "not a valid triangle" };
	private static String instructions = "This is the ancient TriTyp program.\nEnter three integers that represent the lengths of the sides of a triangle.\nThe triangle will be categorized as either scalene, isosceles, equilateral\nor invalid.\n";

	public static void main(String[] argv) { // Driver program for trityp
		int side1, side2, side3;
		int resTriangType;

		System.out.println(instructions);
		System.out.println("Enter side 1: ");
		side1 = getN();
		System.out.println("Enter side 2: ");
		side2 = getN();
		System.out.println("Enter side 3: ");
		side3 = getN();
		resTriangType = Triang(side1, side2, side3);

		System.out.println("Result is: " + triTypes[resTriangType]);
	}

	// ====================================
	// The main triangle classification method
	private static int Triang(int Side1, int Side2, int Side3) {
		int result;

		// triOut is output from the routine:
		// Triang = 1 if triangle is scalene
		// Triang = 2 if triangle is isosceles
		// Triang = 3 if triangle is equilateral
		// Triang = 4 if not a triangle

		// After a quick confirmation that it's a valid
		// triangle, detect any sides of equal length
		if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0) {
			result = 4;
			return (result);
		}

		result = 0;
		if (Side1 == Side2)
			result = result + 1;
		if (Side1 == Side3)
			result = result + 2;
		if (Side2 == Side3)
			result = result + 3;
		if (result == 0) { // Confirm it's a valid triangle before declaring
							// it to be scalene

			if (Side1 + Side2 <= Side3 || Side2 + Side3 <= Side1
					|| Side1 + Side3 <= Side2)
				result = 4;
			else
				result = 1;
			return (result);
		}

		// Confirm it's a valid triangle before declaring
		// it to be isosceles or equilateral

		if (result > 3)
			result = 3;
		else if (result == 1 && Side1 + Side2 > Side3)
			result = 2;
		else if (result == 2 && Side1 + Side3 > Side2)
			result = 2;
		else if (result == 3 && Side2 + Side3 > Side1)
			result = 2;
		else
			result = 4;
		return (result);
	} // end Triang

	// ====================================
	// Read (or choose) an integer
	private static int getN() {
		int inputInt = 1;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inStr;

		try {
			inStr = in.readLine();
			inputInt = Integer.parseInt(inStr);
		} catch (IOException e) {
			System.out.println("Could not read input, choosing 1.");
		} catch (NumberFormatException e) {
			System.out.println("Entry must be a number, choosing 1.");
		}

		return (inputInt);
	} // end getN

} // end trityp class