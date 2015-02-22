package com.vv.class1;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Set of background objects against which a test runs. It allows code share between tests
 * @author vgambhir
 *
 */
public class JUnitFixtures {
	
	Money m1 = null;
	Money m2 = null;
	
	@Before
	public void setUp()
	{
		 m1 = new Money(5,"Dollar");
		 m2 = new Money(4,"Dollar");
		
		
	}
	
	@Test
	public void testEqualsRef()
	{
		
		assertEquals(m1,m2);
	}
	@Test
	public void testEqualsRef1()
	{
		
		assertEquals(m1,m1);
	}
	
	
	@Test
	public void testObjectEqual()
	{
		
		assertEquals(m1,m1);
	}
	
	@Test
	public void testMoneyEqualMethod()
	{
		Money  m3 = new Money(5,"Dollar");
		assertEquals(m1,m3);
	}
	
	@After
	public void tearDown()
	{
		
		m1=null;
		m2=null;
	}

}


class Money
{
	int value;
	String currency;
	
	public Money(int value, String currency) {
		super();
		this.value = value;
		this.currency = currency;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
	
	
	
}