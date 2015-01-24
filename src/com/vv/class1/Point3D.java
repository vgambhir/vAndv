package com.vv.class1;

public class Point3D extends Point {
	
	int z;
	
	public Point3D(int x, int y, int z)
	{
		super(x,y);
		this.z = z;
		
		
	}
	
	@Override
	public boolean equals(Object o)
	{
		return false;
		
	}

	@Override
	public String toString() {
		return "Point3D [x=" + x + ", y=" + y + " ,z ="+z+" ]";
	}

public static void main(String[] args) {
		
		Point p = new Point(1,2);
		System.out.println( p);
		Point3D q = new Point3D(1,2,3);
		p=q;
		System.out.println( p);
		
		
		
		
	}
	
	
	
	

}
