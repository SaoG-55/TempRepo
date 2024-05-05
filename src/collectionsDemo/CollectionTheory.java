package collectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionTheory {

	public static void main(String[] args) 
	{
		// Collection (interface)cant add ele at a specific index position and cant sort also
		Collection <Integer> val=new ArrayList<>();
		val.add(2);
		val.add(22);
		val.add(92);
		val.add(102);
		
		//val.add(2,89); //Collection (interface)cant add ele at a specific index position
		
		//Collections.sort(val);//Collections class can sort List but not Collection interface
		
		//so we use list interface whis is implemented by array list

	}

}
