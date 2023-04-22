import java.io.*;
import java.util.*;
 class Student
 {
	 int rno;
	 String name;
	 float mark;
	 Scanner sc=new Scanner(System.in);
	 void get()
	 {
		 System.out.println("Enter roll no,name and marks=");
		 rno=sc.nextInt();
		 name=sc.nextLine();
		 mark=sc.nextFloat();
	 }
	 void show()
	 {
		 System.out.println("Roll="+rno+"\tName="+name+"\tmarks="+mark);
		 
	 }
 }
 class Record
 {
	 public static void main(String args[]) 
	 {
		Student s1=new Student();
		Student s2=new Student();

		 s1.get();
		 s2.get();
		 s1.show();
		 s2.show();
	 }
 }
 
		 