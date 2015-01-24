package com.swtest.chap1;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * use of specification, clarity, fault and test cases
 * 
 * @author vgambhir
 * 
 */
public class Exercise1_1 {

	public static Vector<String> unionAll(Vector<String> a, Vector<String> b) {
		Vector<String> res = new Vector<String>();
		List<Vector<String>> vList = new ArrayList<Vector<String>>();
		vList.add(a);
		vList.add(b);

		for (Vector<String> v : vList) {

			if (null == v)
				continue;
			for (int i = 0; i < v.size(); i++) {
				String s = v.get(i);
				if (null != s)
					res.add(s);

			}

		}

		return res;

	}

	public static Vector<String> unionUniq(Vector<String> a, Vector<String> b) {
		Vector<String> res = new Vector<String>();
		List<Vector<String>> vList = new ArrayList<Vector<String>>();
		vList.add(a);
		vList.add(b);

		for (Vector<String> v : vList) {
           
			if(null==v)
				continue;
			for (int i = 0; i < v.size(); i++) {
				String s = v.get(i);
				if( (null != s) && (!res.contains(s)))
					res.add(s);

			}

		}

		return res;

	
	}	public static void main(String[] args) {

		Vector<String> v1 = new Vector<String>();
		v1.add("A");
		v1.add(null);
		v1.add("B");
		v1.add("");
		Vector<String> v2 = new Vector<String>();
		v2.add("B");
		
		
		System.out.println(unionAll(v2, v1));
		System.out.println(unionUniq(v2, v1));

	}

}
