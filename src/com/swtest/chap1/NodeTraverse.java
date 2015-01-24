package com.swtest.chap1;

import java.util.ArrayList;
import java.util.List;

public class NodeTraverse {

	List<Node> nodeList;

	public NodeTraverse() {
		nodeList = new ArrayList<Node>();

	}

	class Node {

		String val;

		public Node(String val) {
			this.val = val;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((val == null) ? 0 : val.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			//reference equal
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			// getClass compare
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			
			// checking outer class type
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (val == null) {
				if (other.val != null)
					return false;
			} else if (!val.equals(other.val))
				return false;
			return true;
		}

		private NodeTraverse getOuterType() {
			return NodeTraverse.this;
		}

//		public boolean equals(Object o) {
//			if (null == o)
//				return false;
//
//			if (o.getClass() == this.getClass()) {
//
//				if (((Node) o).val.equals(this.val))
//					return true;
//			}
//			return false;
//
//		}
		
		
		
		

	}

	public int indexOf(Node n) {

		int idx = -1;
		for (int i = 0; i < nodeList.size(); i++) {
			if (n.equals(nodeList.get(i)))
				return i;

		}
		return idx;

	}

}
