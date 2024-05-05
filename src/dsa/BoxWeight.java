package dsa;

public class BoxWeight extends Box 
{
	int weight;
	BoxWeight()
	{
		this.weight=-1;
	}
	
	BoxWeight(int l,int w,int h,int weight)
	{
		super(l,w,h);
		this.weight=weight;
	}
	
	BoxWeight(BoxWeight other)
	{
		super(other);
		this.weight=other.weight;
	}
////	@Override
//	static void greet()
//	{
//		System.out.println("I am in greeting BoxWeight ");
//	}
//	no matter from where you call it will call the Main class as its static
}
