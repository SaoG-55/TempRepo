package dsa;

public class AbstractImplementation extends  AbstractTheory
{

	AbstractImplementation(int n)
	{
		super(n);
	}
	AbstractImplementation()
	{
		super();
	}
	@Override
	void career(String name) 
	{
		
		System.out.println("Developer");
	}

	@Override
	void partner(int age) 
	{
		System.out.println("Nk "+age);
		
	}
	
}
