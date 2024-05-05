package dsa;

public class AbstractMain {

	public static void main(String[] args)
	{
		AbstractImplementation abs=new AbstractImplementation(22);
		AbstractImplementation abs1=new AbstractImplementation();
		abs.partner(25);
		abs.career("Developer");
		System.out.println(abs1.n);
		
		AbstractTheory.methosStatic();
		
		AbstractTheory obj=new AbstractImplementation();
		obj.normalmethod();
		
		//ref variable which method to access
		//obj whic method to run
		//AbstractTheory  contains normalmethod so we can access
		//AbstractImplementation can run overriden methods "normal method "has been overriden so can be called
		
	}

}
