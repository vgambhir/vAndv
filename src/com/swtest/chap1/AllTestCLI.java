package com.swtest.chap1;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
 * Using text runner
 * from the command line
 * 
 * @author vgambhir
 *
 */
@RunWith (Suite.class)
@Suite.SuiteClasses({TestAvailAnno.class})// Add test class here

public class AllTestCLI {

	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
	
	public static Test suite()
	{
		return new JUnit4TestAdapter(AllTests.class);
	}
	
	
	
}
