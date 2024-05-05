package collectionsDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTheory {

	public static void main(String[] args) 
	{
		//Set data is not ordered/indexed
		//we get hashcodes of what data is added
		Set<String> s=new HashSet<>();
		s.add("john");
		s.add("john");
		s.add("johny");
		s.add("molly");
		s.add("john");
		
		System.out.println(s);
		Iterator <String> itr=s.iterator();
		while(itr.hasNext())
		{
			String str=itr.next();
			
			if(str.contains("johny"))
			{
			System.out.println(str);
			}
		}
		s.remove("molly");
		System.out.println(s);
		
		//TreeSet
		//Sorted set as its sorts the elements 
		//unique unordered but sorts in ascending order by default
		Set<String> ts=new TreeSet<>();
		ts.add("john");
		ts.add("john");
		ts.add("johny");
		ts.add("molly");
		ts.add("john");		
		ts.add("abby");
		System.out.println(ts);
	}

}
