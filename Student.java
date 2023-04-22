import java.io.*;
import java.util.*;
  class Student_Record
  {  
      Scanner sc=new Scanner(System.in);
	  int rno,cl;
	  String s=new String();
	  float pm;
	  void get()
	  {
		  System.out.println("Enter Roll no,name ,class and Marks=");
		  rno=sc.nextInt();
		  s=sc.nextLine();
		  cl=sc.nextInt();
		  pm=sc.nextFloat();
		  
	  }
	  void show()
	  {
		  System.out.println("Name="+s);
		  System.out.println("Roll="+rno);
		  System.out.println("Class="+cl);
		  System.out.println("Marks="+pm);
		  
	  }
  }
  class Student
  {
	  public static void main(String args[]) 
	  {
		  Student_Record s=new Student_Record();
		  s.get();
		  s.show();
	  }
  }
  
		  
	  