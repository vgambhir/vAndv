package com.swtest.chap1;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * 
 * // assert(Expected, Actual)
 * 
 * 
 * @author vgambhir
 *
 */
public class Calc {
	
	public long add(int a, int b)
	{
		return a+b;
	}
	
	@Test
	public void testAdd()
	{
		Calc c= new Calc();
		// assert(Expected, test)
		assertEquals((long)5,c.add(2, 3));
		
		
	}
	
	
	
	

}
