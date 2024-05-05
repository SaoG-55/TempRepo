package collectionsDemo;
import java.util.*;


import dsa.Student;
public class ArrayListTheory {

	public static void main(String[] args) 
	{
		//type specific
		List<String> al=new ArrayList<>();
		
		al.add("sam");
		al.add("jam");
		al.add("jam");
		
		al.set(0, "sarsao");
		
		System.out.println(al);
		
		Student obj=new Student();
		obj.setName("kam");
		obj.setAge(22);
		//not type specific
		//Collection not type specific
		List al1=new ArrayList<>();
		al1.add(1);
		al1.add(2.2);
		al1.add('A');
		al1.add(obj);
		
		
		System.out.println(al1);
		
		String n1=al.get(1);
		Object o=al1.get(2);//polymorphism parent can point to any object 
		System.out.println(n1+" "+o);
		
		//update
		al1.set(1, 2.5);
		System.out.println(al1);
		
		//remove
		al1.remove(3);
		System.out.println(al1);
		
		//remove all
		al1.clear();
		System.out.println(al1);

		if(al.contains("sam"))
		{
			System.out.println("sam present");
		}
		
		
		//not type specific
		
		//Handles the error at runtime
		al1.add(1);
		al1.add(2.2);
		al1.add('A');
		al1.add(obj);
		
		// to fetch one value 
		//Obj-to String-Integer value 
		int i=Integer.parseInt(al1.get(0).toString());
		System.out.println("Obj-to String-Integer value "+i);
		
		//iterate
		for(String s:al)
		{
			System.out.println(s);
		}
		
		for(Object obj1:al1)
		{
			System.out.println(obj1);
		}
		
		//using Iterator
		
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext())
		{
			String str=itr.next();
			if(str.equalsIgnoreCase("sam"))
			{
				System.out.println(str);
			}
			
		}
		
		//using stream api
		
		List<Integer> li=new ArrayList<>();
		li.add(23);
		li.add(3);
		li.add(123);
		li.add(33);
		
		li.add(2, 22);
		
		Collections.sort(li);
		
		//stream api
		li.forEach(System.out::println);
		
	}

}
