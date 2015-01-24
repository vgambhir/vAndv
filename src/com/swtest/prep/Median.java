package com.swtest.prep;

import org.junit.Assert;

import org.junit.Test;

public class Median {
	static int median(int x, int y, int z) {
		int m = z;
		if (y < z) {
			if (x < y)
				m = y;
			else if (x < z)
				m = x;
		} else {
			if (x > y)
				m = y;
			else if (x > z)
				m = x;
		}
		return m;
	}

	static int median2(int x, int y, int z) {
		int m = z;
		if (y < z) {
			if (x < y)
				m = y;
			else if (x < z)
				m = y; // mutated
		} else {
			if (x > y)
				m = y;
			else if (x > z)
				m = x;
		}
		return m;
	}

	@Test
	public void vTest() {
		System.out.println(median(3, 4, 5));
		

	}
	
	
	@Test
	public void mediantester2() {
		for (int x : new int[] { -2, -1, 0, 1, 2 }) {
			for (int y : new int[] { -2, -1, 0, 1, 2 }) {
				for (int z : new int[] { -2, -1, 0, 1, 2 }) {
					int m = median2(x, y, z);
					System.out.println(x + ":" + y + ":" + z);
					System.out.println("result: " + m);
					// assert x <= y && y <= z ? m == y : true;
					if (x <= y && y <= z)
						Assert.assertEquals(m, y);
					if (y <= x && x <= z)
						Assert.assertEquals(m, x);
					if (x <= z && z <= y)
						Assert.assertEquals(m, z);
					if (x == y && y == z)
						Assert.assertEquals(m, z);

				}
			}
		}
	}
	
	

	@Test
	public void mediantester() {
		for (int x : new int[] { -2, -1, 0, 1, 2 }) {
			for (int y : new int[] { -2, -1, 0, 1, 2 }) {
				for (int z : new int[] { -2, -1, 0, 1, 2 }) {
					int m = median(x, y, z);
					System.out.println(x + ":" + y + ":" + z);
					System.out.println("result: " + m);
					// assert x <= y && y <= z ? m == y : true;
					if (x <= y && y <= z)
						Assert.assertEquals(m, y);
					if (y <= x && x <= z)
						Assert.assertEquals(m, x);
					if (x <= z && z <= y)
						Assert.assertEquals(m, z);
					if (x == y && y == z)
						Assert.assertEquals(m, z);

				}
			}
		}
	}
}
