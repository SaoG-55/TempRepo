package dsa;

public abstract class AbstractTheory 
{
	int n;
	AbstractTheory()
	{
		this.n=-1;
	}
	AbstractTheory(int n)
	{
		this.n=n;
	}
	
	static void methosStatic()
	{
		System.out.println("static methos in abstract class");
	}
	
	void normalmethod()
	{
		System.out.println("Normal method in AbsractTheory");
	}
	abstract void career(String name);
	abstract void partner(int age);
	
	
}
