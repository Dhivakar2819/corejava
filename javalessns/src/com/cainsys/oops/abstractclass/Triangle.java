package com.cainsys.oops.abstractclass;

public class Triangle  extends Shape
	{
		public Triangle()
		{
			super(0);
			System.out.println("c1 Triangle Object Created "+hashCode());
		}
		public Triangle(int y)
		{
			super(y);
			System.out.println("c2 Triangle Object Created "+hashCode());
		}
		// method override
		public void show()
		{
			System.out.println("Triangle show");
		}
		// not polymorphic
		public void echo()
		{
			super.show();
			System.out.println("Triangle.draw:Height= "+height+" Width= "+width);
		}
		public static void testPolymorphism()
		{
			//Triangle t1=new Shape();
			Shape s1=new Triangle();
			System.out.println("Tri.HC "+s1.hashCode());
			s1.height=123;
			s1.width=100;
			s1.draw();//shape.draw -final method - not a virtual method
			s1.show();// tri.Show - not a final method
		}

}
