import java.io.*;
import java.util.*;
class Circle_area
{
	Scanner sc=new Scanner(System.in);
	float r;
	void get()
	{
		System.out.println("Enter radious of circle=");
		r=sc.nextFloat();
	}
	void area()
	{
		double a=3.14*r*r;
		System.out.println("Area="+a);
	}
}
class Circle
{
	public static void main(String args[])
	{
		Circle_area c=new Circle_area();
		c.get();
		c.area();
	}
}

	