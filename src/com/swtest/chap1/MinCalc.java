package com.swtest.chap1;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
/**
 * Junit exception validation
 * @author vgambhir
 *
 */
public class MinCalc {

	public static <T extends Comparable<? super T>> T min(List<? extends T> list)
			throws Exception {

		if (null == list)
			throw new NullPointerException("list is null");

		if (list.size() == 0)
			throw new IllegalArgumentException("List size is 0");

		Iterator<? extends T> it = list.iterator();
		T min = it.next();
		if (null == min)
			throw new NullPointerException("list is null");

		while (it.hasNext()) {

			T comp = it.next();
			if (comp == null)
				throw new Exception("list is has null as an element");
			// if (comp instanceof T)
			// throw new Exception("list is has null as an element");
			if (comp.compareTo(min) < 0) {
				min = comp;
			}

		}

		return null;
	}

	@Test
	public void testForNull() throws Exception {
		List l = null;
		try {
			MinCalc.min(l);
		} catch (NullPointerException ex) {
			return;
		}
		fail("NullPointerExceptionExpected");

	}

	//annotation expected
	@Test(expected = NullPointerException.class)
	public void testForNull1() throws Exception {
		List l = null;
		MinCalc.min(l);

	}
	//annotation expected
		@Test(expected = ClassCastException.class)
		public void testforMutually() throws Exception {
			List l = null;
			MinCalc.min(l);

		}
}
