package com.swtest.chap1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/*
 * Run class at top level and not at test method level i.e Paramterized class is requireds
 * Test methods are "parameterless" and use instance variables.
 * To mark a test class as a parameterized test, you must first annotate it with @RunWith(Parameterized.class). The class must then provide at least three entities:
 ========================================================
 -A static method that generates and returns test data,
 -A single constructor that stores the test data, and
 - A test.
 https://blogs.oracle.com/jacobc/entry/parameterized_unit_tests_with_junit
 */
@RunWith(Parameterized.class)
public class TestParamAnnon {
	int sum;
	int a;
	int b;

	// constructor
	public TestParamAnnon(int sum, int a, int b) {
		this.sum = sum;
		this.a = a;
		this.b = b;
		System.out.println(this);
	}

	@Test
	public void add() {
		System.out.println("Asserting values" + this);
		assertEquals(sum, a + b);

	}

	// Paramters are passed to constructor and new instance is created
	// then test is run on the instance
	@Parameters
	public static Collection<Object[]> getBaseValue() {
		return Arrays.asList(new Object[][] { { 0, 0, 0 }, { 2, 1, 1 } });
	}

	public String toString() {
		return sum + "=" + a + "+" + b;
	}

}
