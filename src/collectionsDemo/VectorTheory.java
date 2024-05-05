package collectionsDemo;

import java.util.Vector;

public class VectorTheory {

	public static void main(String[] args) 
	{
		// Dynamic array which can increase its size
		Vector<Integer> v=new Vector();
		
		//vector increases it capacity when it exceeds by 100% so memory wastage is more 
		//unlike arraylist which increases its capacity by 50%(sames memory)
		
		//methods of vector are synchronized hence thread safe but not arraylist
		
		
		//s thread safe so SLOW but as arraylist isnt thread safe so FAST
		v.add(23);
		v.add(123);
		v.add(1123);
		v.add(223);
		v.add(423);
		v.add(323);
		v.add(3);
		v.add(203);
		v.add(1239);
		v.add(13);
		v.add(2238);
		v.add(4203);
		v.add(33);
		v.add(35);
		
		System.out.println(v.capacity());
		//aut increases the capacity
		
		v.remove(5);
		
		
		//print enhancedfor
		for(int i:v)
		{
			System.out.println(i);
		}
		System.out.println("****************");
		//using stream api
		v.forEach(System.out::println);
	}

}
