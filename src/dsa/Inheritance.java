package dsa;

public class Inheritance 
{
	
	public static void main(String[] args) 
	{
		Box box=new Box(2,3,4);
		Box box2=new Box(box);
		
		BoxWeight bw=new BoxWeight();
		BoxWeight bw1=new BoxWeight(2,3,4,8);
		System.out.println(bw1.weight+" "+bw1.l);
		
		Box box1=new BoxWeight(2,3,4,8);//upcasting
		//BoxWeight bw2=new Box(2,3,4);
		//we can access all the members of ref variable i.e we need to initialize it 
		//in Box obj but Box obj does not have any iidea about weight variable
		
		BoxWeight bwg=new BoxWeight(2,3,4,8);
		bwg .greet();//static can be inherited but not
		//overriden as overriding depends on obj type and depends on Main Class

	}

}
