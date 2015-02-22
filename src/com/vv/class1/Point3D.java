package com.vv.class1;

public class Point3D extends Point {

	int z;

	public Point3D(int x, int y, int z) {
		super(x, y); //when super class does not have a constructor
		this.z = z;
	}

	public String toString() {
		return "<" + x + ", " + y + ", " + z + ">";
	}

	public boolean equals(Object o) {
		if (o.getClass() != Point3D.class)
			return false;
		Point3D p = (Point3D) o;
		return x == p.x && y == p.y && z == p.z;
	}

	public static void main(String[] a) {
		Point p = new Point(0, 1);
		System.out.println(p);
		Point3D q = new Point3D(0, 1, 2);
		System.out.println(q);
		 p = q; //runtime value of object is equal to object at creation time
		System.out.println(p);
		System.out.println(p.equals(p));
		System.out.println(q.equals(q));
		System.out.println(p.equals(q));
		System.out.println(q.equals(p));
	}
}