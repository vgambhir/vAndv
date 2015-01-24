package com.swtest.prep;

import org.junit.Test;
import static org.junit.Assert.*;

public class C {
	static int min(int x, int y) {

		if (x < y)
			return x;
		return y;
	}

	@Test
	public void test0() {
		int result = min(-3, -4);
		assertTrue(result == -4);
	}

	static int max(int x, int y) {
		int result = x;
		if (y > x) // predicate
			result = y;
		return result;
	}

	@Test
	public void predicate_True() {

		assertTrue(max(1, 9) == 9);
	}
	
	@Test
	public void predicate_False() {

		assertTrue(max(9, 1) == 9);
	}
}