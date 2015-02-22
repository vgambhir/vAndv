package com.vv.class1;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;

/*
 * 
 * all n:header.*next | n !in n.^next
 * Use of bounded exhaustive testing
 */
public class LinkedListImp {

	Node header;
	int size;

	public LinkedListImp() {

		this.header = null;
		this.size = 0;
	}

	public int size() {

		return size;

	}

	public void addFirst(int x) {
		Node n = new Node();
		n.value = x;
		if (null == header)
			header = n;
		else {
			Node temp = header;
			n.next = temp;
			header = n;

		}
		size++;

	}

	@Override
	public String toString() {

		String val = "";
		Node curr = header;
		while (curr != null) {
			val += curr.value + ",";
			curr = curr.next;

		}

		return val;

	}

	static class Node {
		int value;
		Node next;

	}

	// class invariant
	// This is a predicate as it returns a boolean value
	// check for acyclicity
	// size=#header.*next
	public boolean repOK() {
		Set<Node> visited = new HashSet<Node>();
		Node curr = header;
		while (curr != null) {
			if (!visited.add(curr))
				return false;
			curr = curr.next;

		}
       //
		return (size==visited.size());

	}

	public static void main(String[] args) {
		LinkedListImp llist = new LinkedListImp();
		// test constructor
		Assert.assertTrue(llist.repOK());
		System.out.println(llist);
		System.out.println("size = " + llist.size);
		llist.addFirst(4); // after changing structure
		Assert.assertTrue(llist.repOK());
		System.out.println(llist);
		System.out.println("size = " + llist.size);
		llist.addFirst(5);
		System.out.println(llist);
		System.out.println("size = " + llist.size);

	}
}
