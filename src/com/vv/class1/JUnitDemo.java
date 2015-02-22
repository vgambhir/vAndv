package com.vv.class1;

import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitDemo {
	static int add(int x, int y) {
		return x + y;
	}

	static int subtract(int x, int y) {
		return x - y;
	}

	static int div(int x, int y) {
		return x / y;
	}

	@Test
	public void commutativity() {
		assertTrue("Adding 1+2 and 2+1 failed", add(1, 2) == add(2, 1));
	}

	@Test
	public void commutativityMessage() {
		assertTrue("Adding 1+2 and 3+1 failed", add(1, 2) == add(3, 1));
	}

	/**** Exceptions ***********/
	@Test
	public void exceptionalDivide() {
		div(1, 0);
	}

	// Assertion on Exceptions
	@Test(expected = ArithmeticException.class)
	public void exceptionalDivideException() {
		div(1, 0);
	}

	/**** Performance test ***********/
	// time in milliseconds
	@Test(timeout = 5)
	public void loop() {
		for (int i = 0; i < 1000; i++)
			System.out.print(i);
	}
	/**** Failures ***********/
	@Test
	public void forceFailure() {
		fail();
	}

	@Test
	public void forceFailureWithMessage() {
		fail("---- Bingo I failed ----");
	}
}
