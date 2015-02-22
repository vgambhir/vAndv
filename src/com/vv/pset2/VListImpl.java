package com.vv.pset2;

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
public class VListImpl {

	// invariant: loop-list with sorted elements (ascending order Ô<=Õ)
	Node header;
	int size;

	static class Node {
		Node link;
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

	public void add(int x) {
		Node n = new Node();
		n.elem = x;

		// list is empty
		
		if (header == null) {
			header = n;
			n.link = header;
			size++;
			return;
		}

		// checker header node..list is sorted
		Node curr = header;
		if (curr.elem > x) {
			// point header to this new node

			n.link = curr;
			header = n;
			curr.link=header;
			size++;
			return;

		}

	}
	
	
	public void myString()
	{
		
               int count =0;
				Node curr = header;
				while (curr != null) {
					
						System.out.println(curr.elem);
					// move to next reference
					curr = curr.link;
					count++;
					if (count==5)
						break;
					

				}

				
		
	}

	public static void main(String[] args) {

		VListImpl l = new VListImpl();
		l.add(5);
		l.add(2);
		l.myString();
		

	}

}
