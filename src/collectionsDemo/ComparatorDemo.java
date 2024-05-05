package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class ComparatorImplementation implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) 
	{
		if(o1%10 > o2%10)//ascending greater swap
		{
			return 1;
		}
		return -1;
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args)
	{
		List<Integer> li=new ArrayList<>();
		
		li.add(226);
		li.add(203);
		li.add(998);
		li.add(297);
		
		//Anonymous Class
		Comparator<Integer> co=new Comparator<Integer>()
				{
				@Override	
				public int compare(Integer o1,Integer o2)
					{
						if(o1%100 > o2%100)
						{
							return 1;
						}
						return -1;
					}
				};
		
		Collections.sort(li);
		li.forEach(System.out::println);
		System.out.println("**********");
		Collections.reverse(li);
		li.forEach(System.out::println);
		
		System.out.println("****Comparator******");
		
		Comparator<Integer> comp=new ComparatorImplementation();//interface
		Collections.sort(li, comp);
		
		li.forEach(System.out::println);
		
		System.out.println("****Annonymous Comparator******");
		Collections.sort(li,co);
		li.forEach(System.out::println);
		
	}

}
