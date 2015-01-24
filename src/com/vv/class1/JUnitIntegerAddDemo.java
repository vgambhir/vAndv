package com.vv.class1;

import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitIntegerAddDemo {
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
		assertTrue(add(1, 2) == add(2, 1));
	}

	@Test(expected = ArithmeticException.class)
	public void exceptionalDivide() {
		div(1, 0);
	}

	// time in milliseconds
	@Test(timeout = 10)
	public void loop() {
		for (int i = 0; i < 1000; i++)
			System.out.print(i);
	}
}
