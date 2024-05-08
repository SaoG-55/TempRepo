package oops;

public class WrapperClass {

	public static void main(String[] args) 
	{
		
		int a1=10;
		int b1=20;
		
		swapPrimiVal(a1,b1);
		System.out.println(a1+" "+b1);
		//it wont be swapped as these are  primitive values and in Java 
		//there is no such thing "pass by reference everything is passed by value"
		//**************************
		//so "a1 pointer wont be passed just the value its referencing to will be passed"
		//**************************
		
		
		//still the values wont be swapped as "Integer Class" is of final type once declared cant be changed/modified
		//always initialize the final variable while declaring it  as it cant be modified
		Integer a =new Integer(45);
		Integer b=89;//Obects
		
		swapObj(a,b);
		System.out.println("Object variables "+a+" "+b);
	}
	
	//this a1 b1 scope is till this scope of the func only
	//values are passed and not references
	static void swapPrimiVal (int a1 ,int b1)
	{
		int temp=a1;
		a1=b1;
		b1=temp;
		System.out.println(a1+" "+b1+"inside swapPrimiVal func");
	}

	//when Objects are passed then its "passed by reference" 
	static void swapObj(Integer a,Integer b)
	{
		Integer temp=b;
		a=b;
		b=temp;
	}
}
