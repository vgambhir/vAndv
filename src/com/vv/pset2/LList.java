package com.vv.pset2;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Call a singly-linked list a loop-list if it is empty or if it is non-empty
 * and its last node has a pointer back to itself. Consider modeling the
 * following Java program that implements loop-lists with sorted elements:
 * 
 * singly linked loop list
 * 
 * @author vgambhir
 * 
 * 
 *         list with 0 elements 2,3,3
 * 
 */
public class LList {

	// invariant: loop-list with sorted elements (ascending order Ô<=Õ)
	Node header;
	int size;

	static class Node {
		Node next;
		int elem;

	}

	// returns the frequency of x in the list
	public int count(int x) {

		// ...
		return 0;
	}

	public boolean contains(int x) {

		// ...
		return false;
	}

	public boolean repOk() {
		if (null == header)
			return true;
		int count = 0;

		Node curr = header;
		Set<Node> visited = new HashSet<Node>();
		while (true) {
			if (!visited.add(curr))
				break;
			curr=curr.next;
            
			count++;

		}

		return (size == count);
	}

	public void addFirst(int x) {
		Node newNd = new Node();
		newNd.elem = x;

		// list is empty
		if (null == header) {
			newNd.next = newNd;
			header = newNd;

		} else {
			newNd.next = header;
			header = newNd;

		}

		size++;

	}

	public void addLast(int x) {
		Node newNd = new Node();
		newNd.elem = x;
		newNd.next = newNd;

		// list is empty
		if (null == header) {
			header = newNd;

		} else {
			Node curr = header;
			while (curr != curr.next) {
				curr = curr.next;
			}
			curr.next = newNd;

		}

		size++;

	}

	@Override
	public String toString() {

		String val = "";
		Node curr = header;
		if (null == header) {
			return val;
		}
		for (int i = 0; i <= size; i++) {
			val += " " + curr.elem;
			curr = curr.next;

		}

		return val;

	}

	@Test
	public void testAddFirst() {

		LList myList = new LList();
		log("result=" + myList);
		assertTrue(myList.repOk());
		myList.addFirst(1);
		assertTrue(myList.repOk());
		log("result=" + myList);
		assertTrue(myList.repOk());
		myList.addFirst(2);
		assertTrue(myList.repOk());
		log("result=" + myList);

	}

	@Test
	public void testAddLast() {

		LList myList = new LList();
		log("result=" + myList);
		assertTrue(myList.repOk());
		myList.addLast(1);
		assertTrue(myList.repOk());
		log("result=" + myList);
		myList.addLast(2);
		assertTrue(myList.repOk()); 
		log("result=" + myList);

	}

	public static void log(Object o) {
		System.out.println(o);
	}

}
