package collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

//Creating my own Generics(Collection API)
class Container<T extends Number> //t-> data type //of Number Type extended by Integer,Float,Double,Short
{
	T val;
	
	public T getVal() 
	{
		return val;
	}

	public void setVal(T val) 
	{
		this.val = val;
	}

	public void demo(ArrayList<? super T> alist)//t->Number ?->ArrayList<Integer/Number/Float/Short>
	{
		System.out.println(alist);
	}
	public void show()
	{
		System.out.println(val.getClass().getName());
	}
}


public class GenericTheory 
{
	public static void main(String[] args) 
	{
		
		Container <Integer>obj=new Container<>();//T->INTEGER
		//The T gets replaced with the data type passed in this case Number
		//defining the generic hepls the compiler check at runtime the data type
		//obj.val="samu";
		obj.setVal(9);
		//ArrayList<Integer> al=new ArrayList<>();//Integer is not a superclass of Number so X
		ArrayList<Number> al=new ArrayList<>();//?->Number
		al.add(2);
		al.add(3);
		obj.demo(al);
		obj.show();
	}

}
