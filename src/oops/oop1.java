package oops;

import java.util.Arrays;

class Student
{
	int rollno;
	float marks;
	String names;//instance variables are those variables defined inside the class and outside the methods

	
	//constructor defines what happens when the object is created
	//constructor is a special func that runs aut when an object is called and assigns value to the variables
	//constructor called auto when the object is created if not parameterized then default constructor called
	
	public Student(Student other)//a const takes value from another constructor
	{
		this.rollno=other.rollno;
		this.marks=other.marks;
		this.names=other.names;
		
	}
	
	
	public Student(int rollno, float d, String names) {
		super();
		this.rollno = rollno;
		this.marks = d;
		this.names = names;
	}

//	public Student() {
//		super();
//		this.rollno=15;
//		this.marks=90.8f;
//		this.names="som";
//	}
	
	//this is how you call a constructor from another constructor
	public Student()
	{
		this(13,99.8f,"default person");
		//calling parameterized constructor
	}

	public void show()
	{
		System.out.println("My name is "+this.names);
	}
	


}

public class oop1 {

	public static void main(String[] args)
	{
		//objects are stored in heap memory and reference variables are stored in stack memory
		//Student s;//reference variable
		//Student s=new Student();//object variable

		//classes are blueprints using which instance of objects are created
		//it acts as a data type
		
		// roll name marks inside Student class are instance variable->variables inside class and outside the methods are instance variables
		//instance variables are defined outside the method but inside the class
		//s.roll --->> linking "reference variable s with instance variable roll"
		//reference variable---> variables which define an object are reference variables
	
		Student s[]=new Student[5];//s is an array of student object
		//new--->> dynamically allocates the memory at runtime and returns a reference variable for the obj
		System.out.println(Arrays.toString(s));//{null,null,null,null,null}
		int j=10;
//		for(int i=0;i<5;i++)
//		{
//			s[i]=new Student();
//			s[i].rollno=j++;
//			s[i].names="Sarsao";
//			s[i].marks=99.7f;
//			System.out.println(s[i].rollno);
//			System.out.println(s[i].names);
//			System.out.println(s[i].marks);
//		}
		
		s[0]=new Student(1,90.7f,"sao");
		
		System.out.println(s[0].rollno);
		s[1]=new Student(2,90.7f,"sar");
		s[3]=new Student(3,90.7f,"swe");
		s[4]=new Student();
		
		//passing another instance of object in another object
		s[4]=new Student(s[1]);
		System.out.println(s[4].names);
		
		s[2]=new Student();
		System.out.println(s[2].names);
		System.out.println(s[2].marks);
		System.out.println(s[2].rollno);
		
		
		//in java primitive data types are not objects they are stored in stack memory
		//heap memory is slow
	}

}
