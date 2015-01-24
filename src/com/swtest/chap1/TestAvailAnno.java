package com.swtest.chap1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 * Before and After test method
 * @author vgambhir
 * run before will re-initiliaze all instance variable
 * different states will use the objects without sharing the state
 *
 */

public class TestAvailAnno {
	
	int x;
	
	//run before every test method
	@Before
	public void runBefor()
	{
		System.out.println(x);
		System.out.println("in run Before Method");

		x=5;
	}
	
	@Test
	public void testX()
	{
		System.out.println("testX="+ x);
	}
	
	@Test
	public void testY()
	{
		System.out.println("testY="+ x);
	}
	
	
	//run after every test method
	@After
	public void runAfter()
	{
		System.out.println("in run After Method");
		
		x=7;
		System.out.println(x);
		System.out.println("----------------------------------");
		
	}
	@AfterClass
	public static void runAfterClass()
	{
		System.out.println("in run After Class");
		
	}
}
