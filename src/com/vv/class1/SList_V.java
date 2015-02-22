package com.vv.class1;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SList_V {
	Node header;
	int size;

	static class Node {
		int elem;
		Node next;

		@Override
		public String toString() {
			return "Node [elem=" + elem + ", next=" + next + "]";
		}

	}

	@Override
	public String toString() {
		return "SList [header=" + header + ", size=" + size + "]";
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
		SList_V l2 = new SList_V();
		assertTrue(l2.size == 0 && l2.header == null);
		l2.addFirst(4);
		assertTrue(l2.size == 1 && l2.header != null && l2.header.elem == 4);
		l2.addFirst(5);
		System.out.println(l2);

	}

	public static void main(String[] args) {
		SList_V s = new SList_V();
		s.addFirst(4);
		s.addFirst(2);
		s.addFirst(3);
	}

	//invariant
	boolean repOk() {
		if (header == null)
			return size == 0;
		Set<Node> visited = new HashSet<Node>();
		Node current = header;
		while (current != null) {
			if (!visited.add(current))
				return false;
			current = current.next;
		}
		return size == visited.size();
	}

	public static void runA() {
		SList_V s = new SList_V();
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		s.header = n1;
		s.size = 3;
		n1.elem = 3;
		n1.next = n2;
		n2.elem = 2;
		n2.next = n3;
		n3.elem = 4;
		System.out.println(s);
	}

}
