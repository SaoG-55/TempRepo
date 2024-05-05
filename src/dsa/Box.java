package dsa;

public class Box 
{
	 int l,w,h;
	
	Box()
	{
		this.l=-1;
		this.w=-1;
		this.h=-1;
		
	}
	
	Box(int l,int w,int h)
	{
		this.l=l;
		this.w=w;
		this.h=h;
	}
	
	Box(Box old)
	{
		this.l=old.l;
		this.w=old.w;
		this.h=old.h;
	}
	
	public void info()
	{
		System.out.println("running box");
	}
	
	static void greet()
	{
		System.out.println("I am in greeting  ");
	}
}
