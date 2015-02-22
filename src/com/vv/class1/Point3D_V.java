package com.vv.class1;

public class Point3D_V extends Point_V {
	
	int z;
	
	public Point3D_V(int x, int y, int z)
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
		
		Point_V p = new Point_V(1,2);
		System.out.println( p);
		Point3D_V q = new Point3D_V(1,2,3);
		p=q;
		System.out.println( p);
		
		
		
		
	}
	
	
	
	

}
