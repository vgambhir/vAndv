package com.swtest.chap1;

/*
 * Use JUnit4 "org.junit.Assert"
 * // assert(Expected, Actual)
 * assert(Message,Expected, Actual)
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUsage {

	@Test
	public void testMethodX() {
		assertEquals(2, (5 - 3));
		assertTrue(5 > 2);
		assertTrue("value is not correct", 5 > 2);
		assertEquals(new Integer(5), new Integer(5));

	}

	@Test
	public void testMethodY() {
		// throw failed message
		fail("This is a failure message");

	}

	@Test
	public void testMethodZ() {

		assertNull(new String("ABC"));

	}
	@Test
	public void testMethodA() {

		//message, expected,actual,delta
		//for double and floats
		assertEquals("Message",3.42d,3.4d,.1 );

	}


}
