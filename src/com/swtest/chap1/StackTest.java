package com.swtest.chap1;

import java.util.ArrayList;
import java.util.List;

public class StackTest {

	private List<String> elList;

	public StackTest() {
		elList = new ArrayList<String>();
		elList.add("5");
		elList.add("1");
		elList.add("6");

	}
	
	//is representation/structure ok (model ok)
	// do any manipulation, model rules test should always pass
	public boolean repOk()
	{
		if (elList == null)
			return false;
		
		return true;
		
		
	}
	
	

	public String toString1() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int i = elList.size() - 1; i >= 0; i--) {

			sb.append(elList.get(i));
			if (i != 0)
				sb.append(",");
		}
		sb.append("}");
		return sb.toString();

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int i = elList.size() - 1; i >= 0; i--) {

			if (i < (elList.size()-1))
				sb.append(",");
			sb.append(elList.get(i));
			
		}
		sb.append("}");
		return sb.toString();

	}
	
	
	public static void main(String[] args) {
		System.out.println(new StackTest());

	}
}
