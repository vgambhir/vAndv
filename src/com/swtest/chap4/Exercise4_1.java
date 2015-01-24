package com.swtest.chap4;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import org.junit.Test;

public class Exercise4_1 {

	public static int search(List<Integer> list, Object element) {
		if (null == list || element == null)
			throw new NullPointerException();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(element)) {
				return i;
			}

		}

		return -1;

	}
	
	@Test
	public void testElementInList()
	{
	    List<Integer> list= new ArrayList<Integer>();	
	    list.add(3);
	    list.add(3);
	    list.add(1);
	    Assert.assertEquals(0, search(list,3));
		
	}
	@Test
	public void testElementNotInList()
	{
	    List<Integer> list= new ArrayList<Integer>();	
	    list.add(1);
	    list.add(7);
	    list.add(5);
	    Assert.assertEquals(-1, search(list,2));
		
	}
	
	@Test (expected=NullPointerException.class)
	public void testNullElement()
	{
	    List<Integer> list= new ArrayList<Integer>();	
	    list.add(1);
	    list.add(7);
	    list.add(5);
	    Assert.assertEquals(-1, search(list,null));
		
	}
	
	@Test (expected=NullPointerException.class)
	public void testNullList()
	{
	    
	    Assert.assertEquals(-1, search(null,8));
		
	}
	
	
	

}
