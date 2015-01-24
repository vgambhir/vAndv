package com.swtest.chap1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Using Array implement stack
 * 
 * @author vgambhir
 * 
 */
public class MyStack {

	public static int DEFAULT = 3;
	String[] elements;
	// current size of array
	private int size = 0;

	public MyStack() {
		elements = new String[DEFAULT];
	}

	public int size() {

		return size;

	}

	public MyStack pop() throws Exception {
		if (size == 0)
			throw new Exception("No elements to pop");

		elements[size - 1] = null;
		size--;
		return this;

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = size() - 1; i >= 0; i--) {

			sb.append(elements[i] + ",");

		}
		return sb.toString();

	}

	public MyStack push(String x) throws Exception {

		if (size >= DEFAULT)
			throw new Exception("Stack full, can not add more elements");

		elements[size] = x;
		size++;
		return this;

	}

	// ensuring the representation or model is correct
	public boolean repOK() {
		if (elements == null)
			return false;
		if (size() > elements.length)
			return false;

		// none of the elements are null/empty
		for (int i = 0; i < size(); i++) {
			if (elements[i] == null)
				return false;
		}

		return true;
	}

	public static void main(String[] args) throws Exception {
		MyStack ms = new MyStack();
		ms.push("A").push("B").push("C");
		System.out.println(ms);
		// ms.push("D");
		ms.pop().pop().pop();
		System.out.println("after pop" + ms);
		ms.pop();
	}
	
	@Test
	public void testMyStack() throws Exception
	{
		MyStack ms = new MyStack();
		ms.push("A").push("B").push("C");
		assertTrue(ms.repOK());
		
		
	}
	
	
}
