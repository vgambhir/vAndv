package com.vv.testera;

public class BinarySearchTree {
	
	Node root;
	int size;
	
	
	static class Node{
		int element;
		Node left;
		Node right;
		
	}
	
	void remove (int x)
	{
		
	}
	
	//precondition: isTree()..no cycles && isOrdered()
	/**
	 * isTree()
	 * #root.*(left+right) == size  (no of elements is equal to size)
	 * a node
	 * {
	 *   a parent is not its child n! n.^(right+left) // no directed cycle
	 *   sole n.~(left+right) //at most one parent
	 *   no n.left && n.right
	 * 
	 * 
	 * }
	 * 
	 * isOrdered()
	 * all n: root.*(left+right)
	 * 
	 * {
	 * all nl:n.left.*(left+right){n.elem > nl.info}
	 * all nr:n.right.*(left+right){n.elem < nr.info}
	 * 
	 * postcondition:
	 * root.*(left+right).elem = root`.*(left`+right`).elem` - x
	 * 
	 * State mutations// imp to note post state of int
	 * (root.Pre)*(lef.Pret+right.Pre).(elem.Pre)-i = (root.Post)*(lef.Post+right.Post).(elem.Post)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	//postcondition: isTree()..no cycles && isOrdered() && remove only x - size-1, element 
	//does not occur in tree

}
