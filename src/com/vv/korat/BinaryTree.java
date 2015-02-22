package com.vv.korat;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class BinaryTree {

	private Node root; // root node
	private int size; // number of nodes in the tree

	static class Node {
		private Node left; // left
		private Node right; // right child
	}

	public boolean repOk() {
		// checks that empty tree has size zero
		if (root == null)
			return size == 0;

		Set<Node> visited = new HashSet<Node>();
		visited.add(root);

		LinkedList<Node> workList = new LinkedList<Node>();
		workList.add(root); // add root to linked list

		while (!workList.isEmpty()) {
			Node current = (Node) workList.removeFirst();// return root pointer
			// left node
			if (current.left != null) {
				// checks that tree has no cycle
				if (!visited.add(current.left))
					return false;
				workList.add(current.left);
			}
			if (current.right != null)
				// checks that tree has no cycle
				if (!visited.add(current.right))
					return false;
			workList.add(current.right);
		}

		// checks that size is consistent
		if (visited.size() != size)
			return false;
		return true;

	}
}
