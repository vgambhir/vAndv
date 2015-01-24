package com.swtest.chap1;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

/*
 *  The class declaration should be annotated with @RunWith(Theories.class), and it must provide two entities:

 1. A data method that generates and returns test data
 2. A theory.
 For all a, b > 0  the following is true: a+b > a and a+b > b
 */
@RunWith(Theories.class)
public class TestTheoryAnnon {

	// The theories in a class get executed with every possible combination of
	// data points.
	@Theory
	public void testRelationshipA(Integer a, Integer b) {
		System.out.println("a=" + a + ",b=" + b);
		assertTrue(a + b > a);
		assertTrue(a + b > b);

	}

	
	@Theory
	public void testCommutative(Integer a, Integer b) {
		System.out.println("a=" + a + ",b=" + b);
		assertTrue(a +b == b+a);
		

	}
	
	// 2 slots, 3 possibilities = 3x3=9

	@DataPoints
	public static int[] positiveIntegers() {

		return new int[] {

		1, 10,3,5 }; // 4*4 = 16

	}

}
