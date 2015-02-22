package com.vv.class1;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Test is by testing acyclicity (no cycles)
 * class example
 *
 */
public class SLList {
	Node header;
	int size;

	static class Node {
		int elem;
		Node next;
	}

	public void addFirst(int x) {
		Node n = new Node();
		n.elem = x;
		n.next = header;
		header = n;
		size++;
	}

	@Test
	public void t0() {
		SLList l = new SLList();
		assertTrue(l.size == 0 && l.header == null);
		l.addFirst(4);
		assertTrue(l.size == 1 && l.header != null && l.header.elem == 4);
		assertTrue(l.toString().equals("[4]"));
	}

	// public static void main(String[] a) {
	// SLList l2 = new SLList();
	// l2.addFirst(4);
	// l2.addFirst(2);
	// l2.addFirst(3);
	//
	// SLList l = new SLList();
	// Node n1 = new Node();
	// Node n2 = new Node();
	// Node n3 = new Node();
	// l.header = n1; l.size = 3;
	// n1.elem = 3; n1.next = n2;
	// n2.elem = 2; n2.next = n3;
	// n3.elem = 4;
	// System.out.println(l);
	// }
}