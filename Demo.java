import java.io.*;
import java.util.*;
class Rectangle
{
		private float l,b;
		Scanner sc=new Scanner(System.in);
		public void get()
		       {
			     System.out.println("Enter lenght and breadth=");
			     l=sc.nextFloat();
			     b=sc.nextFloat();
		       }
		     void area()
			 {
				 double a=l*b;
				 System.out.println("Area="+a);
			 }
	}
	class Demo
	{
		public static void main(String args[])
		{
			Rectangle r=new Rectangle();
			r.get();
			r.area();
		}
	}
	
			 
				 
				
				 
			